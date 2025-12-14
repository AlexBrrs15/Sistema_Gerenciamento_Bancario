public class Conta {

    private Cliente cliente;
    private int numero;
    private int agencia;
    private double saldo;


public Conta(Cliente cliente, int numero, int agencia, double saldo){
        this.cliente = cliente;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }
    public int getNumero(){
        return numero;
    }
    public int getAgencia(){
        return agencia;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
            return false;
        }
    }
}