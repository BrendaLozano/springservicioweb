CREATE TABLE PERSONAS(
PERSONA_ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(15),
APE_PAT NVARCHAR2(15),
APE_MAT NVARCHAR2(15),
EDAD NUMBER, 
PESO NUMBER(3,1), 
ESTATURA NUMBER(3,2),
ESTADO_CIVIL NVARCHAR2(12),
CONSTRAINT CHECK_ESTADO_CIVIL CHECK (ESTADO_CIVIL IN ('CASADO', 'SOLTERO', 'UNION LIBRE'))
);

CREATE SEQUENCE PERSONA_SEQ;

CREATE OR REPLACE TRIGGER ON_INSERT_PERSONAS BEFORE
  INSERT ON PERSONAS FOR EACH ROW BEGIN
  SELECT PERSONA_SEQ.NEXTVAL INTO :new.PERSONA_ID FROM dual;
END;

-- REGISTROS DE PRUEBA
INSERT ALL
INTO PERSONAS (NOMBRE,APE_PAT,APE_MAT,EDAD, PESO, ESTATURA,ESTADO_CIVIL)VALUES('LUIS','MORALES','DOMINGUEZ',20,70.5,1.70,'SOLTERO')
INTO PERSONAS (NOMBRE,APE_PAT,APE_MAT,EDAD, PESO, ESTATURA,ESTADO_CIVIL)VALUES('ANA','TORRES','FERNANDEZ',29,65.3,1.50,'CASADO')
INTO PERSONAS (NOMBRE,APE_PAT,APE_MAT,EDAD, PESO, ESTATURA,ESTADO_CIVIL)VALUES('LAURA','GUTIERREZ','MORA',18,82.5,1.80,'UNION LIBRE')
SELECT *  FROM DUAL;

SELECT * FROM PERSONAS;
