package com.example.demo.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {

    @GetMapping("/reserva")
    public String showReservaPage(Model model) {
        // Adicione qualquer lógica necessária aqui
        return "reserva"; // Certifique-se de que o template "reserva.html" existe em src/main/resources/templates/
    }
}
