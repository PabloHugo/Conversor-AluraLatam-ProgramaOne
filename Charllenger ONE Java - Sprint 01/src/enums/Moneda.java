package enums;

import java.math.BigDecimal;

public enum Moneda {

  
    DOLAR(BigDecimal.valueOf(142.80)),
    EURO(BigDecimal.valueOf(146.83)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(175.76)),
    REAL(BigDecimal.valueOf(29.45)),
    PESO_CHILENO(BigDecimal.valueOf(0.18));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
