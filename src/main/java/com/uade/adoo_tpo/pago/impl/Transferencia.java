package com.uade.adoo_tpo.pago.impl;

import com.uade.adoo_tpo.pago.MedioDePago;

public class Transferencia extends MedioDePago {

    public void pagar(float monto) {
        System.out.println(monto + " pagado con transferencia");
    }
}
