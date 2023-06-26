package com.uade.adoo_tpo.estadoReserva.impl;

import com.uade.adoo_tpo.domain.Factura;
import com.uade.adoo_tpo.domain.Reservas;
import com.uade.adoo_tpo.estadoReserva.Estado;

import java.time.LocalDateTime;

public class Pagada implements Estado {

    @Override
    public void cancelar(Reservas reservas) {
        reservas.setEstado(new Cancelada());
    }

    @Override
    public void pagar(Reservas reservas) {

    }

    public void generarFactura(Reservas reservas){
        reservas.setFactura(Factura.builder()
                .fechaPago(LocalDateTime.now())
                .monto(reservas.getMontoWithPolitica())
                .build());
    }
}
