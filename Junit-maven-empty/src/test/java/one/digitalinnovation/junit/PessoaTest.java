package one.digitalinnovation.junit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    public void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2022, 1, 1));
        Assertions.assertEquals(2,pessoa.getIdade());
    }
}
