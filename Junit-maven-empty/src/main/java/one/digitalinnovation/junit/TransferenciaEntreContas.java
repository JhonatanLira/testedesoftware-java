package one.digitalinnovation.junit;

public class TransferenciaEntreContas {

   public void transferencia(Conta contaOrigem, Conta Destino, int valor){

        if(valor <=0){
            throw
                    new IllegalArgumentException("Valor deve ser maior que zero ");
        }
    }
}
