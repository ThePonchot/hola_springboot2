package py.com.expaae.example.hola_sprng2.servicio;

import java.util.List;

import py.com.expaae.example.hola_sprng2.domain.Persona;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar (Persona persona);

    public void eliminar (Persona persona);

    public Persona encontrarPersona (Persona persona);
}
