package com.uade.adoo_tpo.unit;

import com.uade.adoo_tpo.domain.Cliente;
import com.uade.adoo_tpo.domain.Habitacion;
import com.uade.adoo_tpo.domain.Reservas;
import com.uade.adoo_tpo.domain.Sistema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteEstadoHabitacion {
    Sistema sistema = new Sistema();
    //HABITACIONES
    Habitacion habitacion1 = new Habitacion();
    Habitacion habitacion2 = new Habitacion();



    @BeforeEach
    public void setUp(){

        habitacion1.setIdHAbitacion(1);
        habitacion2.setIdHAbitacion(2);
        sistema.crearCliente("Juan","Lopez","45813648","1548761257","juan@gmail.com","Mail");
        sistema.crearCliente("Roman","Riquelme","26062011","1548765481","roman@gmail.com","SMS");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime after48Hours = now.plusHours(48);
        List<Cliente> listaClientes = sistema.getListaClientes();
        sistema.reservar(listaClientes.get(0),habitacion1,now,after48Hours);
        sistema.reservar(listaClientes.get(1),habitacion2,now,after48Hours);



    }

    @Test
    public void reserva1PoseeHabitacion1(){
        sistema.reporteDeDisponibilidad();
    }
}
