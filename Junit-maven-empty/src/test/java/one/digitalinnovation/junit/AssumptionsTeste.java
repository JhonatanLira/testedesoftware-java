package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoApenasNoUsuarioJhonatan(){
        //Assumptions.assumeFalse("Jhonatan".equals("USER"));
        Assumptions.assumeTrue("Jhonatan".equals("USER"));
        Assertions.assertEquals(10,5+5);
    }
}