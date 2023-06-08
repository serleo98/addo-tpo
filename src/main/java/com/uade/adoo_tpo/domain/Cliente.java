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
}
