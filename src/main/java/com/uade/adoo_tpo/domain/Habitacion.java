package com.uade.adoo_tpo.domain;

import com.uade.adoo_tpo.domain.enums.HabitacionExtras;
import com.uade.adoo_tpo.domain.enums.TipoDehabitacion;
import lombok.Data;

@Data
public class Habitacion {
    private int cantidadDePersonas;
    private TipoDehabitacion tipoDehabitacion;
    private HabitacionExtras extras;
}
