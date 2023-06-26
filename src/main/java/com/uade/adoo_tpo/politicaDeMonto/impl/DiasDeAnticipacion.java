package com.uade.adoo_tpo.politicaDeMonto.impl;

import com.uade.adoo_tpo.politicaDeMonto.PoliticaDeMonto;

public class DiasDeAnticipacion extends PoliticaDeMonto {
        public double calcularCosto(String politica_monto, float monto) {
            return (monto * 0.85);
        }
}
