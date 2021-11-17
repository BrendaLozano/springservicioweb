package com.mspersona.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PERSONAS")
public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PERSONA_ID", columnDefinition= "NUMBER")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_auto")
	@SequenceGenerator(name = "id_auto", sequenceName = "PERSONA_SEQ", allocationSize=1)
	int personaId;
	
	@Column(name="NOMBRE", columnDefinition= "NVARCHAR(15)")
	String nombre;
	
	@Column(name="APE_PAT", columnDefinition= "NVARCHAR(15)")
	String apePat;
	
	@Column(name="APE_MAT", columnDefinition= "NVARCHAR(15)")
	String apeMat;
	
	@Column(name="EDAD", columnDefinition= "NUMBER")
	int edad;
	
	@Column(name="PESO", columnDefinition= "NUMBER(3,1)")
	double peso;
	
	@Column(name="ESTATURA", columnDefinition= "NUMBER(3,1)")
	double estatura;
	
	@Column(name="ESTADO_CIVIL", columnDefinition= "NVARCHAR(12)")
	String estadoCivil;


	public int getPersonaId() {
		return personaId;
	}


	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApePat() {
		return apePat;
	}


	public void setApePat(String apePat) {
		this.apePat = apePat;
	}


	public String getApeMat() {
		return apeMat;
	}


	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

}
