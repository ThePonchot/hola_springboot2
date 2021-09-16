package py.com.expaae.example.hola_sprng2.dao;

import org.springframework.data.repository.CrudRepository;

import py.com.expaae.example.hola_sprng2.domain.Persona;


public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}