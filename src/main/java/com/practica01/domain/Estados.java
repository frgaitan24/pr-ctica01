package com.practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class Estados {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;//Transforma en id_estado
    String nombre;
    String capital;
    int poblacion;
    int costas;

    public Estados() {
    }

    public Estados(String nombre, String capital, int poblacion, int costas) {

        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;

    }
}
