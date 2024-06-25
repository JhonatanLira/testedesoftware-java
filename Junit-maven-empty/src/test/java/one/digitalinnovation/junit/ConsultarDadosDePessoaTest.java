package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
        //System.out.println("Rodou configuraConexao()");
    }

    @BeforeEach
    void insereDadosParaTest() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(200, 1, 1)));
    }

    @AfterEach
    void removeDadosParaTest() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(200, 1, 1)));
    }

    @Test
    void validadeDadosRetorno() {
       // Assertions.assertTrue(true);
       Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        //System.out.println("Rodou finalizarConexao()");
    }
}
