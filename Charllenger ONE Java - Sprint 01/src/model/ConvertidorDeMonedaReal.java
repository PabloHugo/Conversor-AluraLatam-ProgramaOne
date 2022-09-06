package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaReal extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesoArgentino) {
        moneda = Moneda.REAL;
        return super.convertirParaMoneda(moneda, valorEnPesoArgentino);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.REAL;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}
