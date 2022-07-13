
package com.GenerosiApp.controller;

import com.GenerosiApp.dao.VoluntariadoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.GenerosiApp.domain.Voluntariado;
import com.GenerosiApp.service.VoluntariadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private VoluntariadoService voluntariadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        var voluntariados = voluntariadoService.getVoluntariados();
        model.addAttribute("voluntariados", voluntariados);
        return "index";
    }
    @GetMapping("/nuevoVoluntariado")
    public String nuevoVoluntariado(Voluntariado voluntariado) {
        return "modificarVoluntariado";
    }
    @PostMapping("/guardarVoluntariado")
    public String guardarVoluntariado(Voluntariado voluntariado) {
        voluntariadoService.save(voluntariado);
        return "redirect:/";
    }
    @GetMapping("/modificarVoluntariado/{id_voluntariado}")
    public String modificarVoluntariado(Voluntariado voluntariado, Model model) {
        voluntariado = voluntariadoService.getVoluntariado(voluntariado);
        model.addAttribute("voluntariado",voluntariado);
        return "modificarVoluntariado";
    }
    @GetMapping("/eliminarVoluntariado/{id_voluntariado}")
    public String eliminarVoluntariado(Voluntariado voluntariado) {
        voluntariadoService.delete(voluntariado);
        return "redirect:/";
    }
}
