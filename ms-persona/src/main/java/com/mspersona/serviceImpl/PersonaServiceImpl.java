package com.mspersona.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mspersona.entity.Persona;
import com.mspersona.repository.PersonaRepository;
import com.mspersona.request.PersonaRequest;
import com.mspersona.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	
	@Autowired
	PersonaRepository repo;

	@Override
	public List<Persona> listarPersona() {			
		return repo.findAll();
	}

	@Override
	public Persona buscarPersona(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Persona insertarPersona(PersonaRequest request) {
		Persona p = new Persona();		
		p.setNombre(request.getNombre());
		p.setApePat(request.getApePat());
		p.setApeMat(request.getApeMat());
		p.setEdad(request.getEdad());
		p.setPeso(request.getPeso());
		p.setEstatura(request.getEstatura());
		p.setEstadoCivil(request.getEstadoCivil());		
		repo.save(p);
		return p;
	}

	@Override
	public Persona actualizar(PersonaRequest object) {
		Persona p = repo.findById(object.getPersonaId()).get();
		
		p.setNombre(object.getNombre());
		p.setApePat(object.getApePat());
		p.setApeMat(object.getApeMat());
		p.setEdad(object.getEdad());
		p.setPeso(object.getPeso());
		p.setEstatura(object.getEstatura());
		p.setEstadoCivil(object.getEstadoCivil());	
		
		repo.save(p);
		return p;
	}

	@Override
	public String bajaPersona(int id) {
		repo.deleteById(id);
		return "Persona Eliminada";
	}
	
	
}
