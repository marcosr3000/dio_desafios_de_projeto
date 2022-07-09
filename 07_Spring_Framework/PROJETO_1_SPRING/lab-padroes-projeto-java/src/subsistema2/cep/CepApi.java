package subsistema2.cep;

import padroes.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araxá";
    }
    public String recuperarEstado(String cep) {
        return "MG";
    }
}
