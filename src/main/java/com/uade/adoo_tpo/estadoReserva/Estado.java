package com.uade.adoo_tpo.estadoReserva;

import com.uade.adoo_tpo.domain.Reservas;

public interface Estado {
    void cancelar(Reservas reservas);
    void pagar(Reservas reservas);
}
