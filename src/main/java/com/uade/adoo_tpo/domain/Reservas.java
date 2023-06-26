package com.uade.adoo_tpo.domain;

import com.uade.adoo_tpo.estadoReserva.Estado;
import com.uade.adoo_tpo.notificacion.Notificacion;
import com.uade.adoo_tpo.pago.MedioDePago;
import com.uade.adoo_tpo.politicaDeMonto.PoliticaDeMonto;
import com.uade.adoo_tpo.politicaDeMonto.impl.DiasDeAnticipacion;
import com.uade.adoo_tpo.politicaDeMonto.impl.MesesDeAnticipacion;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.time.temporal.ChronoUnit.DAYS;

@Data
@Builder
public class Reservas {

    private Notificacion modoNotificacion;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Cliente cliente;
    private Habitacion habitacion;
    private PoliticaDeMonto politicaDeMonto;
    private Estado estado;
    private MedioDePago medioDePago;
    private float monto;
    private float montoWithPolitica;
    private Factura factura;


    public void pagar(){
        estado.pagar(this);
    }

    public void cancelar(){
        estado.cancelar(this);
    }

    public float calcularMonto(){

        long daysBetween = DAYS.between(LocalDateTime.now(), checkIn);

        if(daysBetween<61){
            setPoliticaDeMonto(new DiasDeAnticipacion());
        }else {
            setPoliticaDeMonto(new MesesDeAnticipacion());
        }

        return politicaDeMonto.calcularCosto(this.monto);
    }

    public void enviarFactura(){
        if(Objects.nonNull(this.factura)){
            this.modoNotificacion.enviarNotificacion(this.cliente, "envio factura");
        }
        System.out.println("No tiene Factura");
    }

    public void enviarNotificacion(){
        this.modoNotificacion.enviarNotificacion(this.cliente, "envio notificacion");
    }
}
