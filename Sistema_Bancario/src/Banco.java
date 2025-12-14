import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(){
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
    }

    public void buscarCliente(String cpf){
        for(Cliente cliente : clientes){
            if(cliente.getCpf().equals(cpf)){
                System.out.println("Cliente encontrado: " + cliente.getNome());
                return;
            }
        }
    }

    public void buscarConta(int numero){
        for(Conta conta : contas){
            if(conta.getNumero() == numero){
                System.out.println("Conta encontrada: " + conta.getNumero());
                return;
            }
        }
    }

    public void transferir(int numOrigem, int numDestino, double valor){
        Conta contaOrigem = null;
        Conta contaDestino = null;

        for(Conta conta : contas){
            if(conta.getNumero() == numOrigem){
                contaOrigem = conta;
            }
            if(conta.getNumero() == numDestino){
                contaDestino = conta;
            }

        }

        // validações
        if (contaOrigem == null) {
            System.out.println("Conta de origem não encontrada.");
            return;
        }

        if (contaDestino == null) {
            System.out.println("Conta de destino não encontrada.");
            return;
        }

        if (contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Falha na transferência. Verifique o saldo da conta de origem.");
        }

    }
}
