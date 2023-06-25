package com.uade.adoo_tpo.domain;

import com.uade.adoo_tpo.domain.enums.HabitacionExtras;
import com.uade.adoo_tpo.domain.enums.TipoDehabitacion;
import lombok.Data;

import java.util.List;

@Data
public class Habitacion {
    private static int contador = 0;
    private int id;
    private int cantidadDePersonas;
    private TipoDehabitacion tipoDehabitacion;
    private List<HabitacionExtras> extras;

    public Habitacion() {
        this.id = ++contador;
    }
}
