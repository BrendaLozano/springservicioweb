package com.mspersona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mspersona.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

	
	
}
