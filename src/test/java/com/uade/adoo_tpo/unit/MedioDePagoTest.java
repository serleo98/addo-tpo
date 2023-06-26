package com.uade.adoo_tpo.unit;


import com.uade.adoo_tpo.pago.MedioDePago;
import com.uade.adoo_tpo.pago.impl.Efectivo;
import com.uade.adoo_tpo.pago.impl.TarjetaDeCredito;
import com.uade.adoo_tpo.pago.impl.TarjetaDeDebito;
import com.uade.adoo_tpo.pago.impl.Transferencia;
import org.junit.jupiter.api.Test;

public class MedioDePagoTest {

    @Test
    public void EfectivoTest(){
        MedioDePago efectivo = new Efectivo();
        efectivo.pagar(100);
    }

    @Test
    public void CreditoTest(){
        MedioDePago credito = new TarjetaDeCredito();
        credito.pagar(100);
    }

    @Test
    public void DebitoTest(){
        MedioDePago debito = new TarjetaDeDebito();
        debito.pagar(100);
    }

    @Test
    public void TransferenciaTest(){
        MedioDePago transferencia = new Transferencia();
        transferencia.pagar(100);
    }
}
