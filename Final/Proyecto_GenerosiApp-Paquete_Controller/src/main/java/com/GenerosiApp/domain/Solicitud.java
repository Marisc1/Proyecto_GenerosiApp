package com.GenerosiApp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "solicitud")
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_solicitud;
    private String cedula;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Solicitud() {
    }

    public Solicitud(String cedula, String correo, String contrasena, String nombre, String apellidos, String telefono) {
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    

}
