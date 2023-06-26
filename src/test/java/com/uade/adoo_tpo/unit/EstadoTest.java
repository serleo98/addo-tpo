package com.uade.adoo_tpo.unit;


import com.uade.adoo_tpo.domain.Reservas;
import com.uade.adoo_tpo.estadoReserva.Estado;
import com.uade.adoo_tpo.estadoReserva.impl.Cancelada;
import com.uade.adoo_tpo.estadoReserva.impl.Pagada;
import com.uade.adoo_tpo.estadoReserva.impl.PedienteDePago;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstadoTest {

    @Test
    public void test1(){
        Reservas reservas =  Reservas.builder().build();
        Estado estado = new PedienteDePago();
        estado.pagar(reservas);

        assert reservas.getEstado() instanceof Cancelada;
    }
}
