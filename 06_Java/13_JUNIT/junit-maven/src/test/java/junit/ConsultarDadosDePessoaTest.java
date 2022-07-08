package junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDados.iniciarConexao();
//        System.out.println("rodou configuraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDados.insereDados(new Pessoa("Maria", LocalDate.of(2000, 1, 1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDados.removeDados(new Pessoa("Maria", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno () {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2 () {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDados.finalizarConexao();
//        System.out.println("rodou finalizarConexao");
    }


}
