public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema Bancario Iniciado\n");

        Banco banco = new Banco();
        // Criando clientes e contas
        Conta conta1 = new Conta(new Cliente("12345678900", "Joao Silva", "11999999999", "@jv"),
                1001, 123, 500.0);
        Conta conta2 = new Conta(new Cliente("98765432100", "Maria Souza", "21988888888", "@ms"),
                1002, 123, 300.0);

        // Adicionando clientes e contas ao banco
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        banco.adicionarCliente(conta1.getCliente());
        banco.adicionarCliente(conta2.getCliente());

    
        System.out.println("O saldo do(a) "+ conta1.getCliente().getNome()+ " e " + conta1.getSaldo());
        System.out.println("O saldo do(a) "+ conta2.getCliente().getNome()+ " e " + conta2.getSaldo() + "\n");

        // Testando operações
        conta1.sacar(200);
        System.out.println("O saldo apos saque do(a) "+ conta1.getCliente().getNome()+ " e " + conta1.getSaldo());

        conta2.depositar(150);
        System.out.println("O saldo apos deposito do(a) "+ conta2.getCliente().getNome()+ " e " + conta2.getSaldo() + "\n");


        banco.transferir(conta1.getNumero(), conta2.getNumero(), 100);
        System.out.println("O saldo apos transferencia do(a) "+ conta1.getCliente().getNome()+ " e " + conta1.getSaldo());
        System.out.println("O saldo apos transferencia do(a) "+ conta2.getCliente().getNome()+ " e " + conta2.getSaldo() + "\n");

        conta1.sacar(500); // Tentativa de saque com saldo insuficiente
        conta1.sacar(200); // Saque válido
        System.out.println("O saldo apos saque do(a) "+ conta1.getCliente().getNome()+ " e " + conta1.getSaldo());  

        // Testando busca de cliente
        Cliente cliente = banco.buscarCliente(conta1.getCliente().getCpf());
        System.out.println("Cliente buscado: " + cliente.getNome());
    }
}
