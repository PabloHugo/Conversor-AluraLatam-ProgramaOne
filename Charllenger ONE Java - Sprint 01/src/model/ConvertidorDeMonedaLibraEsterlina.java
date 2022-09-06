package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaLibraEsterlina extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesoArgentino) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaMoneda(moneda, valorEnPesoArgentino);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.LIBRA_ESTERLINA;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}
