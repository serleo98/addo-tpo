package com.uade.adoo_tpo.notificacion.impl;

import com.uade.adoo_tpo.domain.Cliente;
import com.uade.adoo_tpo.notificacion.Notificacion;

public class Whatsapp extends Notificacion {
    public void enviarNotificacion(Cliente cliente, String msg) {
        System.out.println("Cliente notificado mediante Whatsapp, msg: "+msg);
    }
}
