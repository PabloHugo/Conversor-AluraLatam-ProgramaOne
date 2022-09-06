package enums;

public enum TipoConversion {
	PESO_ARGENTINO_PARA_DOLAR("De Peso Argentino a Dolar"),
	PESO_ARGENTINO_PARA_EURO("De Peso Argentino a Euro"),
	PESO_ARGENTINO_PARA_LIBRA_ESTERLINA("De Peso Argentino a Libra Esterlina"),
	PESO_ARGENTINO_PARA_REAL ("De Peso Argentino a Real"),
	PESO_ARGENTINO_PARA_PESO_CHILENO("De Peso Argentino a Peso Chileno"),
    DOLAR_PARA_PESO_ARGENTINO("De Dolar a Peso Argentino"),
    EURO_PARA_PESO_ARGENTINO("De Euro a Peso Argentino"),
    LIBRA_ESTERLINA_PARA_PESO_ARGENTINO("De Libra Esterlina a Peso Argentino"),
    REAL_PARA_PESO_ARGENTINO("De Real a Peso Argentino"),
    PESO_CHILENO_PARA_PESO_ARGENTINO("De Peso Chileno a Peso Argentino"),


    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
