import enums.TipoConversion;

import model.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Convertir moneda";
        String conversionDeTemperatura = "Convertir temperatura";

        boolean ejecuta = true;

        Repetidor repetidor = new Repetidor();

        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige la Operación",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                String operacionMonedas = JOptionPane.showInputDialog(null, "Elija la Conversión",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.PESO_ARGENTINO_PARA_DOLAR.getDescripcion(),
                                TipoConversion.PESO_ARGENTINO_PARA_EURO.getDescripcion(),
                                TipoConversion.PESO_ARGENTINO_PARA_LIBRA_ESTERLINA.getDescripcion(),
                                TipoConversion.PESO_ARGENTINO_PARA_REAL.getDescripcion(),
                                TipoConversion.PESO_ARGENTINO_PARA_PESO_CHILENO.getDescripcion(),
                                TipoConversion.DOLAR_PARA_PESO_ARGENTINO.getDescripcion(),
                                TipoConversion.EURO_PARA_PESO_ARGENTINO.getDescripcion(),
                                TipoConversion.LIBRA_ESTERLINA_PARA_PESO_ARGENTINO.getDescripcion(),
                                TipoConversion.REAL_PARA_PESO_ARGENTINO.getDescripcion(),
                                TipoConversion.PESO_CHILENO_PARA_PESO_ARGENTINO.getDescripcion()},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduzca la cantidad a Convertir");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversao(operacionMonedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacionTemperatura = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipoConversion.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipoConversion.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipoConversion.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipoConversion.KELVIN_PARA_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduzca la T° a Convertir");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversion(operacionTemperatura, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = repetidor.intentaRepetir();
        }

    }
}
