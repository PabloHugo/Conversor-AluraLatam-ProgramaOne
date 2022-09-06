package model;

import enums.Moneda;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String PESO_ARGENTINO_PARA_DOLAR = "De Peso Argentino a Dolar";
    private static final String PESO_ARGENTINO_PARA_EURO = "De Peso Argentino a Euro";
    private static final String PESO_ARGENTINO_PARA_LIBRA_ESTERLINA = "De Peso Argentino a Libra Esterlina";
    private static final String PESO_ARGENTINO_PARA_REAL = "De Peso Argentino a Real";
    private static final String PESO_ARGENTINO_PARA_PESO_CHILENO = "De Peso Argentino a Peso Chileno";
    private static final String DOLAR_PARA_PESO_ARGENTINO = "De Dolar a Peso Argentino";
    private static final String EURO_PARA_PESO_ARGENTINO = "De Euro a Peso Argentino";
    private static final String LIBRA_ESTERLINA_PARA_PESO_ARGENTINO = "De Libra Esterlina a Peso Argentino";
    private static final String REAL_PARA_PESO_ARGENTINO = "De Real a Peso Argentino";
    private static final String PESO_CHILENO_PARA_PESO_ARGENTINO = "De Peso Chileno a Peso Argentino";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaReal = new ConvertidorDeMonedaReal();
    private ConvertidorDeMoneda convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESO_ARGENTINO_PARA_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_REAL -> {
                return convertidorDeMonedaReal.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_PESO_CHILENO -> {
                return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaDolar.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaEuro.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
            }
            case REAL_PARA_PESO_ARGENTINO -> {
                return  convertidorDeMonedaReal.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaPesoChileno.convertirParaPesoArgentino(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("Elección Inválida");
        }

    }

}
