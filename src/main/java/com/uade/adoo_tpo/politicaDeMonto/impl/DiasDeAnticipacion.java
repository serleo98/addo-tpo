package com.uade.adoo_tpo.politicaDeMonto.impl;

import com.uade.adoo_tpo.politicaDeMonto.PoliticaDeMonto;

public class DiasDeAnticipacion extends PoliticaDeMonto {

    //15 dias
        public float calcularCosto(float monto) {
            return (float) (monto * 0.85);
        }
}
