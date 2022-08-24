package com.GenerosiApp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "voluntario")
public class Voluntario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_voluntario;
    private String cedula;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;

    public Voluntario() {
    }

    public Voluntario(String cedula, String correo, String contrasena, String nombre, String apellidos) {
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

}
