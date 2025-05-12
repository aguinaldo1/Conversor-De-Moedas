package conversor;

import java.util.Map;

public class RespostaTaxaCambio {
    private String result;
    private Map<String, Double> conversion_rates;

    public RespostaTaxaCambio(String result, Map<String, Double> conversion_rates) {
        this.result = result;
        this.conversion_rates = conversion_rates;
    }

    public String getResult() {
        return result;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }
}
