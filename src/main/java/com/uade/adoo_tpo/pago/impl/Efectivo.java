package com.uade.adoo_tpo.pago.impl;

import com.uade.adoo_tpo.pago.MedioDePago;

public class Efectivo extends MedioDePago {

    @Override
    public void pagar(float monto) {
    System.out.println(monto + " pagado en efectivo");
    }
}
