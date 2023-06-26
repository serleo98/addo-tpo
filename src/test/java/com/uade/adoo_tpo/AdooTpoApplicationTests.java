package com.uade.adoo_tpo;

import com.uade.adoo_tpo.domain.Cliente;
import com.uade.adoo_tpo.domain.Habitacion;
import com.uade.adoo_tpo.domain.Sistema;
import com.uade.adoo_tpo.domain.enums.HabitacionExtras;
import com.uade.adoo_tpo.domain.enums.TipoDehabitacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static com.uade.adoo_tpo.domain.enums.HabitacionExtras.*;
import static com.uade.adoo_tpo.domain.enums.TipoDehabitacion.HABITACION;
import static com.uade.adoo_tpo.domain.enums.TipoDehabitacion.SUITE;

@SpringBootTest
class AdooTpoApplicationTests {

    Habitacion habitacion = new Habitacion();
    Habitacion habitacion2 = new Habitacion();
    Habitacion habitacion3 = new Habitacion();
    List<Habitacion> lista = new ArrayList<Habitacion>();
    Sistema sistema = new Sistema(lista);

    @BeforeEach
    public void setUp(){
        habitacion.setCantidadDePersonas(2);

        List<HabitacionExtras> extras = new ArrayList<HabitacionExtras>();
        extras.add(SERVICIO);
        extras.add(MINI_BAR);
        habitacion.setExtras(extras);

        habitacion.setTipoDehabitacion(SUITE);

        lista.add(habitacion);

        habitacion2.setCantidadDePersonas(0);

        List<HabitacionExtras> extras2 = new ArrayList<HabitacionExtras>();
        extras2.add(SERVICIO);
        extras2.add(MINI_BAR);
        habitacion2.setExtras(extras2);

        habitacion2.setTipoDehabitacion(HABITACION);

        lista.add(habitacion2);

        habitacion3.setCantidadDePersonas(5);

        List<HabitacionExtras> extras3 = new ArrayList<HabitacionExtras>();
        extras3.add(SERVICIO);
        extras3.add(TV);
        habitacion3.setExtras(extras3);

        habitacion3.setTipoDehabitacion(SUITE);

        lista.add(habitacion3);
    }

    @Test
    public void habitacion(){
        sistema.buscarHabitacion("tv");
        sistema.buscarHabitacion("mini bar");
    }
}
