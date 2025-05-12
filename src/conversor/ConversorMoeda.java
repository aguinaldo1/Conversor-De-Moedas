package conversor;

public class ConversorMoeda {
    private final ServicoTaxaCambio servico;

    public ConversorMoeda() {
        this.servico = new ServicoTaxaCambio();
    }

    public double converter(String de, String para, double valor) throws Exception {
        double taxa = servico.obterTaxa(de, para);
        return valor * taxa;
    }
}
