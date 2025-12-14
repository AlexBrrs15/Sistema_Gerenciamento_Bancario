public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema Bancario Iniciado");

        Conta conta1 = new Conta(new Cliente("12345678900", "Joao Silva", "11999999999", "@jv"),
                1001, 123, 500.0);
        Conta conta2 = new Conta(new Cliente("98765432100", "Maria Souza", "21988888888", "@ms"),
                1002, 123, 300.0);

        System.out.println("O saldo do(a) "+ conta1.getCliente().getNome()+ " e " + conta1.getSaldo());
    }
}
