package com.uade.adoo_tpo.pago.impl;

import com.uade.adoo_tpo.pago.MedioDePago;

public class TarjetaDeCredito extends MedioDePago {

    @Override
    public void pagar(float monto) {
        System.out.println(monto + " pagado con tarjeta de credito");
    }
}
