package com.mspersona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mspersona.entity.Persona;
import com.mspersona.request.PersonaRequest;
import com.mspersona.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	PersonaService service;
	
	
	@GetMapping("mostrar-todos")
	public List<Persona> getAll() {
		List<Persona> list = service.listarPersona();
		return list;
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Persona getById(@PathVariable int id) {
		return service.buscarPersona(id);
	}

	@PostMapping("/guardar")
	public Persona save(@RequestBody PersonaRequest request) {
		return service.insertarPersona(request);
	}

	@PutMapping("/actualizar")
	public Persona update(@RequestBody PersonaRequest request) {
		return service.actualizar(request);
	}

	@DeleteMapping("eliminar/{id}")
	public String delete(@PathVariable int id) {
		return service.bajaPersona(id);
	}

}
