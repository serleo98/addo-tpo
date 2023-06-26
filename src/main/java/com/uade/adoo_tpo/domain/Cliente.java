package com.uade.adoo_tpo.domain;

import lombok.Data;

@Data
public class Cliente {
    private String nombre;
    private String apellido;
    private String doc;
    private String phone;
    private String email;
    private String contactoDePreferencia;


    public Cliente(String nombre, String apellido, String doc, String phone, String email, String contactoDePreferencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = doc;
        this.phone = phone;
        this.email = email;
        this.contactoDePreferencia = contactoDePreferencia;
    }
}
