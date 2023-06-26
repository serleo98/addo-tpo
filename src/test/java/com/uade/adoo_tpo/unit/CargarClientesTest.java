package com.uade.adoo_tpo.unit;

import com.uade.adoo_tpo.domain.Reservas;
import com.uade.adoo_tpo.domain.Sistema;
import com.uade.adoo_tpo.estadoReserva.Estado;
import com.uade.adoo_tpo.estadoReserva.impl.Cancelada;
import com.uade.adoo_tpo.estadoReserva.impl.PedienteDePago;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CargarClientesTest {
    Sistema sistema = new Sistema();

    @BeforeEach
    public void setUp() {
        sistema.crearCliente("Juan","Lopez","45813648","1548761257","juan@gmail.com","Mail");
        sistema.crearCliente("Roman","Riquelme","26062011","1548765481","roman@gmail.com","SMS");
    }

    @Test
    public void test1(){
       System.out.println(sistema.getListaClientes());
    }
}

