package com.uade.adoo_tpo.notificacion.impl;

import com.uade.adoo_tpo.domain.Cliente;
import com.uade.adoo_tpo.notificacion.Notificacion;

public class SMS extends Notificacion {
    public void enviarNotificacion(Cliente cliente) {
        System.out.println("Cliente notificado mediante SMS");
    }
}
