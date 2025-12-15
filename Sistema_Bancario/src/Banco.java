import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(){
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
    }

    public Cliente buscarCliente(String cpf){
        for(Cliente cliente : clientes){
            if(cliente.getCpf().equals(cpf)){
                return cliente  ;
            }
        }
        return null;
    }

    public Conta buscarConta(int numero, int agencia){
        for(Conta conta : contas){
            if(conta.getNumero() == numero && conta.getAgencia() == agencia){
                return conta;
            }
        }
        return null;
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
    public void adicionarConta(Conta conta) {
            if(conta == null){
                return;
            }
            contas.add(conta);

            Cliente clienteConta = conta.getCliente();
            if(clienteConta != null && buscarCliente(clienteConta.getCpf()) == null){
                clientes.add(clienteConta);
            }
        }
    
    public void adicionarCliente(Cliente cliente) {
            clientes.add(cliente);
        }   
}
