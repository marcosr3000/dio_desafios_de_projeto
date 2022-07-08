package junit;

import java.util.logging.Logger;

public class BancoDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");

    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoa no BD
        LOGGER.info("Inseriu Dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoa no BD
        LOGGER.info("Removeu Dados");
    }
}
