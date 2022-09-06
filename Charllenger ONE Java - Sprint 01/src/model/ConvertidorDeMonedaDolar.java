package model;

import enums.Moneda;

import java.math.BigDecimal;

public class ConvertidorDeMonedaDolar extends ConvertidorDeMoneda {

    @Override
    public BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesoArgentino) {
        moneda = Moneda.DOLAR;
        return super.convertirParaMoneda(moneda, valorEnPesoArgentino);
    }

    @Override
    public BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda) {
        moneda = Moneda.DOLAR;
        return super.convertirParaPesoArgentino(moneda, valorEnMoneda);
    }
}
