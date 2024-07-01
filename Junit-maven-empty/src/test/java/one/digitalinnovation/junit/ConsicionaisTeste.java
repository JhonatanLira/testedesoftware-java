package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConsicionaisTeste {

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
        //@EnabledOnJre(JRE.JAVA_17)
        // @EnabledOnOs({OS.LINUX, OS.WINDOWS})
        // @EnabledOnOs(OS.LINUX)
        //@DisabledIfEnvironmentVariable(named = "USER", matches = "root")
        //@EnabledIfEnvironmentVariable(named = "USER", matches = "Jhonatan")
    void validarAlgoApenasNoUsuarioJhonatan() {
        //Assumptions.assumeFalse("Jhonatan".equals("USER"));
        // Assumptions.assumeTrue("Jhonatan".equals("USER"));
        Assertions.assertEquals(10, 5 + 5);
    }
}
