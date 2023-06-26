package com.uade.adoo_tpo.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Factura {
    private LocalDateTime fechaPago;
    private float monto;
}
