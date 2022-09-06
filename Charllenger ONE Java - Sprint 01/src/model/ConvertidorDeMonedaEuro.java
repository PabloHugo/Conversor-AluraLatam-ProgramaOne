package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaEuro extends ConvertidorDeMoneda {
    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesoArgentino) {
        moneda = Moneda.EURO;
        return super.convertirParaMoneda(moneda, valorEnPesoArgentino);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.EURO;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}
