package com.uade.adoo_tpo.notificacion;

import com.uade.adoo_tpo.domain.Cliente;

public abstract class Notificacion {
    public abstract void enviarNotificacion(Cliente cliente);
}
