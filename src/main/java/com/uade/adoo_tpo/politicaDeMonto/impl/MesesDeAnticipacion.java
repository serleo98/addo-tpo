package com.uade.adoo_tpo.politicaDeMonto.impl;

import com.uade.adoo_tpo.politicaDeMonto.PoliticaDeMonto;

public class MesesDeAnticipacion extends PoliticaDeMonto {
    // 2 meses
        public float calcularCosto(float monto) {
            return (float) (monto * 0.8);
    }
}
