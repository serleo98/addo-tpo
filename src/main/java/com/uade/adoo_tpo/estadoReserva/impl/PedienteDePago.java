package com.uade.adoo_tpo.estadoReserva.impl;

import com.uade.adoo_tpo.domain.Reservas;
import com.uade.adoo_tpo.estadoReserva.Estado;

public class PedienteDePago implements Estado {
    @Override
    public void cancelar(Reservas reservas) {
        reservas.setEstado(new Cancelada());
    }

    @Override
    public void pagar(Reservas reservas) {
        reservas.setEstado(new Pagada());
    }
}
