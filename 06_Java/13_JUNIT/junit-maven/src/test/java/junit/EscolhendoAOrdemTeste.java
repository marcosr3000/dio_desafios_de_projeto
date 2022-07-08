package junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

//    @Order(4)
    @DisplayName("Teste que valida se usuário foi criado")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

//    @Order(3)
    @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

//    @Order(2)
    @DisplayName("D")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

//    @Order(1)
    @DisplayName("C")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
