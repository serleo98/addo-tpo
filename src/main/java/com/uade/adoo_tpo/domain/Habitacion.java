package com.uade.adoo_tpo.domain;

import com.uade.adoo_tpo.domain.enums.HabitacionExtras;
import com.uade.adoo_tpo.domain.enums.TipoDehabitacion;
import lombok.Data;

import java.util.List;

@Data
public class Habitacion {
    private  int idHAbitacion;
    private int cantidadDePersonas;
    private TipoDehabitacion tipoDehabitacion;
    private List<HabitacionExtras> extras;
}
