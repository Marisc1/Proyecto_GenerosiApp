/*
package com.GenerosiApp.controller;

import com.GenerosiApp.dao.VoluntarioDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.GenerosiApp.domain.Voluntario;
import com.GenerosiApp.service.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexControllerVoluntario {

    @Autowired
    private VoluntarioService voluntarioService;

    @GetMapping("/")
    public String inicio(Model model) {
        var voluntarios = voluntarioService.getVoluntarios();
        model.addAttribute("voluntarios", voluntarios);
        return "index";
    }

    @GetMapping("/nuevoVoluntario")
    public String nuevoVoluntario(Voluntario voluntario) {
        return "modificarVoluntario";
    }

    @PostMapping("/guardarVoluntario")
    public String guardarVoluntario(Voluntario voluntario) {
        voluntarioService.save(voluntario);
        return "redirect:/";
    }

    @GetMapping("/modificarVoluntario/{id_voluntario}")
    public String modificarVoluntario(Voluntario voluntario, Model model) {
        voluntario = voluntarioService.getVoluntario(voluntario);
        model.addAttribute("voluntario", voluntario);
        return "modificarVoluntario";
    }

    @GetMapping("/eliminarVoluntario/{id_voluntario}")
    public String eliminarVoluntario(Voluntario voluntario) {
        voluntarioService.delete(voluntario);
        return "redirect:/";
    }
}
*/