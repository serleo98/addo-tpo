package com.uade.adoo_tpo.domain;

import com.uade.adoo_tpo.notificacion.Notificacion;
import com.uade.adoo_tpo.estadoReserva.Estado;
import com.uade.adoo_tpo.pago.MedioDePago;
import com.uade.adoo_tpo.politicaDeMonto.PoliticaDeMonto;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Reservas {

    private Notificacion modoNotificacion;

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Cliente cliente;
    private Habitacion habitacion;
    private PoliticaDeMonto politicaDeMonto;
    private Estado estado;
    private MedioDePago medioDePago;
    private BigDecimal monto;

}
