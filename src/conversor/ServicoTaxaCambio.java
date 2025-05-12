package conversor;

import com.google.gson.Gson;

public class ServicoTaxaCambio {

    private final Gson gson = new Gson();

    public double obterTaxa(String origem, String destino) throws Exception {
        String url = Constantes.URL_BASE + Constantes.API_KEY + "/latest/" + origem;
        String respostaJson = HttpUtil.get(url);

        RespostaTaxaCambio resposta = gson.fromJson(respostaJson, RespostaTaxaCambio.class);

        if (!"success".equals(resposta.getResult())) {
            throw new Exception("Erro ao obter taxa de câmbio.");
        }

        if (!resposta.getConversionRates().containsKey(destino)) {
            throw new Exception("Código de moeda não encontrado.");
        }

        return resposta.getConversionRates().get(destino);
    }
}
