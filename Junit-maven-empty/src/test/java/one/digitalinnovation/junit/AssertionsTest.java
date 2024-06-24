package one.digitalinnovation.junit;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLanlamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        //Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);
    }
    @Test
    void validarSeObjetoEstaNulo(){

        Pessoa pessoa = null;
        //Assertions.assertNull(pessoa);
        assertNull(pessoa);

        pessoa = new Pessoa("Jorge", LocalDate.now());
        //Assertions.assertNotNull(pessoa);
        assertNotNull(pessoa);
    }

    @Test
    void validadeNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;
        //Assertions.assertEquals(valor,outroValor);
        assertEquals(valor,outroValor);
    }
}
