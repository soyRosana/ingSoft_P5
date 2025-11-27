package es.uma.informatica.salud.ingsoft.IngSoft_P5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/nombreControlador")
public class HelloController {

    @GetMapping
    public String saludo() {
        // devuelve exactamente lo que pediste
        return "¡hello world!";
    }
}
