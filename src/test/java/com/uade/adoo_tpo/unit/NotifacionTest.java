package com.uade.adoo_tpo.unit;

import com.uade.adoo_tpo.domain.Cliente;
import com.uade.adoo_tpo.notificacion.Notificacion;
import com.uade.adoo_tpo.notificacion.impl.Mail;
import com.uade.adoo_tpo.notificacion.impl.SMS;
import com.uade.adoo_tpo.notificacion.impl.Whatsapp;
import org.junit.jupiter.api.Test;

public class NotifacionTest {

    @Test
    public void Mailtest(){
        Notificacion mail = new Mail();
        Cliente cliente = new Cliente();
        mail.enviarNotificacion(cliente);
    }

    @Test
    public void Whatsapptest(){
        Notificacion whatsapp = new Whatsapp();
        Cliente cliente = new Cliente();
        whatsapp.enviarNotificacion(cliente);
    }

    @Test
    public void SMStest(){
        Notificacion SMS = new SMS();
        Cliente cliente = new Cliente();
        SMS.enviarNotificacion(cliente);
    }

}
