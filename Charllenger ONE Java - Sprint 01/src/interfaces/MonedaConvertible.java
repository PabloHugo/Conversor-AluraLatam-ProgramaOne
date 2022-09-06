package interfaces;

import enums.Moneda;

import java.math.BigDecimal;

public interface MonedaConvertible {

    BigDecimal convertirParaMoneda(Moneda moneda, BigDecimal valorEnPesoArgentino);
    BigDecimal convertirParaPesoArgentino(Moneda moneda, BigDecimal valorEnMoneda);

}
