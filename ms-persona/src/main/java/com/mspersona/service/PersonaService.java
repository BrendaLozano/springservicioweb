package com.mspersona.service;

import java.util.List;

import com.mspersona.entity.Persona;
import com.mspersona.request.PersonaRequest;

public interface PersonaService {
	
	List<Persona> listarPersona();
	public Persona buscarPersona(int id);
	public Persona insertarPersona(PersonaRequest request);
	public Persona actualizar(PersonaRequest object);
	public String bajaPersona(int  id);
	

}
