package com.uade.adoo_tpo.unit;


import com.uade.adoo_tpo.domain.Habitacion;
import com.uade.adoo_tpo.domain.Reservas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Cargar habitaciones y disponibilidad
*/

public class HabitacionesyDisponibilidad {
    //HABITACIONES
    Habitacion habitacion1 = new Habitacion();
    Habitacion habitacion2 = new Habitacion();
    Habitacion habitacion3 = new Habitacion();
    Habitacion habitacion4 = new Habitacion();
    Habitacion habitacion5 = new Habitacion();
    //RESERVAS
    Reservas reserva1 =  Reservas.builder().build();
    Reservas reserva2 = Reservas.builder().build();
    Reservas reserva3 = Reservas.builder().build();
    Reservas reserva4 = Reservas.builder().build();


    @BeforeEach
    public void setUp(){
        habitacion1.setIdHAbitacion(1);
        habitacion2.setIdHAbitacion(2);
        habitacion3.setIdHAbitacion(3);
        habitacion4.setIdHAbitacion(4);
        habitacion5.setIdHAbitacion(5);
        reserva1.setHabitacion(habitacion1);
        reserva2.setHabitacion(habitacion2);
        reserva3.setHabitacion(habitacion3);
        reserva4.setHabitacion(habitacion4);
    }
    @Test
    public void reserva1PoseeHabitacion1(){
        assertEquals(habitacion1, reserva1.getHabitacion());
    }
    @Test
    public void reserva1PoseeHabitacion2(){
        assertEquals(habitacion2, reserva1.getHabitacion());
    }
}
