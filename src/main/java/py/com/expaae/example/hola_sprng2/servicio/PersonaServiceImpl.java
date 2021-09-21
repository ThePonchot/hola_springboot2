package py.com.expaae.example.hola_sprng2.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.com.expaae.example.hola_sprng2.dao.PersonaDao;
import py.com.expaae.example.hola_sprng2.domain.Persona;

@Service
public class  PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;
    
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas(){
        return (List<Persona>)personaDao.findAll(); 
        
    }

    @Transactional
    public void guardar (Persona persona){
        personaDao.save(persona);
    }

    @Transactional
    public void eliminar (Persona persona){
        personaDao.delete(persona);
    }

    @Transactional(readOnly = true)
    public Persona encontrarPersona (Persona persona){
        return personaDao.findById(persona.getPersona_id()).orElse(null);
    }
}
