package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

//    @Test
//    @EnabledIfEnvironmentVariable(named = "USER", matches = "marcos")
//    void validarAlgoSomenteNoUsuarioMarcos() {
//        Assertions.assertEquals(10, 5 + 5);
//    }

//    @Test
//    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
//    void validarAlgoSomenteNoUsuarioMarcos() {
//        Assertions.assertEquals(10, 5 + 5);
//    }

//    @Test
//    @EnabledOnOs(OS.MAC)
//    void validarAlgoSomenteNoUsuarioMarcos() {
//        Assertions.assertEquals(10, 5 + 5);
//    }

//    @Test
//    @EnabledOnOs({OS.MAC, OS.LINUX})
//    void validarAlgoSomenteNoUsuarioMarcos() {
//        Assertions.assertEquals(10, 5 + 5);
//    }

    @Test
//    @EnabledOnJre(JAVA_11)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void validarAlgoSomenteNoUsuarioMarcos() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
