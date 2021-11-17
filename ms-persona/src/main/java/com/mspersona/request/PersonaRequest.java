package com.mspersona.request;

public class PersonaRequest {
	

	int personaId;
	String nombre;
	String apePat;
	String apeMat;
	int edad;
	double peso;
	double estatura;
	String estadoCivil;
	
	
	public PersonaRequest() {
		
	}


	public PersonaRequest(int personaId, String nombre, String apePat, String apeMat, int edad, double peso, double estatura,
			String estadoCivil) {
		this.personaId = personaId;
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.estadoCivil = estadoCivil;
	}


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


	@Override
	public String toString() {
		return "Persona [personaId=" + personaId + ", nombre=" + nombre + ", apePat=" + apePat + ", apeMat=" + apeMat
				+ ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + ", estadoCivil=" + estadoCivil + "]";
	}
	

}
