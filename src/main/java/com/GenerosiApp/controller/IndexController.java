package com.GenerosiApp.controller;

import com.GenerosiApp.dao.VoluntariadoDao;
import com.GenerosiApp.domain.Administrador;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.GenerosiApp.domain.Voluntariado;
import com.GenerosiApp.domain.Voluntario;
import com.GenerosiApp.service.AdministradorService;
import com.GenerosiApp.service.VoluntariadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.GenerosiApp.service.VoluntarioService;
import com.GenerosiApp.dao.AdministradorDao;
import com.GenerosiApp.domain.Administrador;
import com.GenerosiApp.service.AdministradorService;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private VoluntariadoService voluntariadoService;
    @Autowired
    private VoluntarioService voluntarioService;
    @Autowired
    private AdministradorService administradorService;

    
    @GetMapping("/c")
    public String Inicio(Model model) {
        var voluntariados = voluntariadoService.getVoluntariados();
        model.addAttribute("voluntariados", voluntariados);
        return "index";
    }
    
    @GetMapping("/")
    public String inicio1() {
        
        return "inicio";
    }

    @GetMapping("/a")
    public String inicio2(Model model) {
        var voluntarios = voluntarioService.getVoluntarios();
        model.addAttribute("voluntarios", voluntarios);
        return "indexVoluntario";
    }

    @GetMapping("/b")
    public String inicio3(Model model) {
        var administradores = administradorService.getAdministradores();
        model.addAttribute("administradores", administradores);
        return "indexAdministrador";
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
        model.addAttribute("voluntariado", voluntariado);
        return "modificarVoluntariado";
    }

    @GetMapping("/eliminarVoluntariado/{id_voluntariado}")
    public String eliminarVoluntariado(Voluntariado voluntariado) {
        voluntariadoService.delete(voluntariado);
        return "redirect:/";
    }

    @GetMapping("/nuevoVoluntario")
    public String nuevoVoluntario(Voluntario voluntario) {
        return "modificarVoluntario";
    }

    @PostMapping("/guardarVoluntario")
    public String guardarVoluntario(Voluntario voluntario) {
        voluntarioService.save(voluntario);
        return "redirect:/a";
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
        return "redirect:/a";
    }

    @GetMapping("/nuevoAdministrador")
    public String nuevoAdministrador(Administrador administrador) {
        return "modificarAdministrador";
    }

    @PostMapping("/guardarAdministrador")
    public String guardarCliente(Administrador administrador) {
        administradorService.save(administrador);
        return "redirect:/b";
    }

    @GetMapping("/modificarAdministrador/{id_administrador}")
    public String modificarAdministrador(Administrador administrador, Model model) {
        administrador = administradorService.getAdministrador(administrador);
        model.addAttribute("administrador", administrador);
        return "modificarAdministrador";
    }

    @GetMapping("/eliminarAdministrador/{id_administrador}")
    public String eliminarAdministrador(Administrador administrador) {
        administradorService.delete(administrador);
        return "redirect:/b";
    }

}
