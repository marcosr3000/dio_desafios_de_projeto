package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Marcos", LocalDate.of(1987, 5, 9));
        Assertions.assertEquals(35, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa marcos = new Pessoa ("Marcos", LocalDate.of(1987, 5, 9));
        Assertions.assertTrue(marcos.ehMaiorDeIdade());

        Pessoa joao = new Pessoa ("Joao", LocalDate.now()); //--> criar o cenário
        Assertions.assertFalse(joao.ehMaiorDeIdade()); //--> executa validações
    }
}
