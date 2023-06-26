package com.uade.adoo_tpo.unit;

import com.uade.adoo_tpo.politicaDeMonto.PoliticaDeMonto;
import com.uade.adoo_tpo.politicaDeMonto.impl.DiasDeAnticipacion;
import com.uade.adoo_tpo.politicaDeMonto.impl.MesesDeAnticipacion;
import org.junit.jupiter.api.Test;

public class PoliticaDeMontoTest {

    @Test
    public void DiasDeAnticipacionTest(){
        PoliticaDeMonto dias = new DiasDeAnticipacion();
        double result = dias.calcularCosto(100);
        assert result == 100 * 0.85;
    }

    @Test
    public void MesesDeAnticipacionTest(){
        PoliticaDeMonto meses = new MesesDeAnticipacion();
        float result = meses.calcularCosto(100);
        assert result == 100 * 0.80;
    }

}
