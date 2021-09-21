package py.com.expaae.example.hola_sprng2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
import lombok.extern.slf4j.Slf4j;
import py.com.expaae.example.hola_sprng2.dao.PersonaDao;
import py.com.expaae.example.hola_sprng2.servicio.PersonaService;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio (Model model){        
        log.info("Iniciando controlador del Spring MVC");
        var personas = personaService.listarPersonas();
        log.debug("debugeando el servicio HOLA MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
