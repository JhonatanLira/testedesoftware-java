package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ExceptionsTeste {

    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta(123456,0);
        Conta contaDestino = new Conta(456789,100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,()->
                transferenciaEntreContas.transferencia(contaOrigem,contaDestino,-1));
    }
}
