package com.uade.adoo_tpo.domain;


import com.uade.adoo_tpo.domain.enums.HabitacionExtras;
import com.uade.adoo_tpo.domain.enums.TipoDehabitacion;
import lombok.Data;

import java.util.List;

@Data
public class Sistema {
    private List<Habitacion> listaHabitacion;

    public Sistema(List<Habitacion> habitacion) {
        this.listaHabitacion = habitacion;
    }

    public void buscarHabitacion(String criterio) {
        if (criterio.equalsIgnoreCase("Cantidad de personas")) {
            for (Habitacion habitacion : listaHabitacion) {
                if (habitacion.getCantidadDePersonas() != 0) {
                    System.out.println(habitacion);
                }
            }
        }
        else if (criterio.equalsIgnoreCase("habitacion")) {
            for (Habitacion habitacion:listaHabitacion){
                if (habitacion.getTipoDehabitacion().equals(TipoDehabitacion.HABITACION)){
                    System.out.println(habitacion);
                }
            }
        }
        else if (criterio.equalsIgnoreCase("suite")){
            for (Habitacion habitacion:listaHabitacion){
                if (habitacion.getTipoDehabitacion().equals(TipoDehabitacion.SUITE)){
                    System.out.println(habitacion);
                }
            }
        }
        else if (criterio.equalsIgnoreCase("tv")){
            for (Habitacion habitacion:listaHabitacion){
                for (HabitacionExtras extra: habitacion.getExtras()){
                    if (extra.equals(HabitacionExtras.TV)){
                        System.out.println(habitacion);
                    }
                }
            }

        }
        else if (criterio.equalsIgnoreCase("servicio")){
            for (Habitacion habitacion:listaHabitacion){
                for (HabitacionExtras extra: habitacion.getExtras()){
                    if (extra.equals(HabitacionExtras.SERVICIO)){
                        System.out.println(habitacion);
                    }
                }
            }

        }
        else if (criterio.equalsIgnoreCase("despertador")){
            for (Habitacion habitacion:listaHabitacion){
                for (HabitacionExtras extra: habitacion.getExtras()){
                    if (extra.equals(HabitacionExtras.DESPERTADOR)){
                        System.out.println(habitacion);
                    }
                }
            }

        }
        else if (criterio.equalsIgnoreCase("internet")){
            for (Habitacion habitacion:listaHabitacion){
                for (HabitacionExtras extra: habitacion.getExtras()){
                    if (extra.equals(HabitacionExtras.INTERNET)){
                        System.out.println(habitacion);
                    }
                }
            }

        }
        else if (criterio.equalsIgnoreCase("mini bar")){
            for (Habitacion habitacion:listaHabitacion){
                for (HabitacionExtras extra: habitacion.getExtras()){
                    if (extra.equals(HabitacionExtras.MINI_BAR)){
                        System.out.println(habitacion);
                    }
                }
            }

        }
    }
}