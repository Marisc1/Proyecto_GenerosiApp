package com.GenerosiApp.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "voluntariado")
public class Voluntariado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_voluntariado;
    private String fecha;
    private String direccion;
    private String motivo;


    public Voluntariado() {
    }

    public Voluntariado(String fecha, String direccion, String motivo) {
        this.fecha = fecha;
        this.direccion = direccion;
        this.motivo = motivo;
    }

}
