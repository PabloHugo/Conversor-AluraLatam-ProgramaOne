package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaPesoChileno extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesoArgentino) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaMoneda(moneda, valorEnPesoArgentino);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.PESO_CHILENO;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}
