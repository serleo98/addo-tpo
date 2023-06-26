package com.uade.adoo_tpo.domain;


import com.uade.adoo_tpo.domain.enums.HabitacionExtras;
import com.uade.adoo_tpo.domain.enums.TipoDehabitacion;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Data
public class Sistema {

    private List<Habitacion> listaHabitacion = new ArrayList<>();
    private List<Reservas> listaReservas = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();

    public Sistema(List<Habitacion> habitacion) {
        this.listaHabitacion = habitacion;
    }

    public Sistema() {
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

    public void reservar(Cliente cliente,
                         Habitacion habitacion,
                         LocalDateTime checkin,
                         LocalDateTime checkOut){
        Reservas reserva = Reservas.builder()
                .cliente(cliente)
                .habitacion(habitacion)
                .checkIn(checkin)
                .checkOut(checkOut)
                .build();

        listaReservas.add(reserva);
    }

    public void cancelarReseva(Reservas reserva){
        reserva.cancelar();
        listaReservas.add(reserva);
    }

    public void pagar(Reservas reservas){
        reservas.pagar();
    }

    public void crearCliente(String nombre,
                             String apellido,
                             String doc,
                             String phone,
                             String email,
                             String contactoDePreferencia){

        Cliente cliente = new Cliente(nombre,apellido,doc,phone,email,contactoDePreferencia);
        listaClientes.add(cliente);

    }

    public Set<Map> reporteDeDisponibilidad(){

        Set<Map> disponibilidad = new LinkedHashSet<>();
        List<Reservas> reservadas = listaReservas.stream().filter(r-> Objects.nonNull(r.getFactura())).collect(Collectors.toList());

        reservadas.forEach(r->{
                disponibilidad.add(new HashMap<String,Object>(){{
                    put("estado","reservado");
                    put("habitacion",r.getHabitacion());
                }});
        });

        listaHabitacion.forEach(h->{
            disponibilidad.add(new HashMap<String,Object>(){{
                put("estado","disponible");
                put("habitacion",h);
            }});
        });


        return disponibilidad;
    }
}
