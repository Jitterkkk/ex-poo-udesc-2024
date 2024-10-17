package exercicio3oo;

public class ContaBancaria {
    private String titular;
    private double saldo;

    //Construtor padrão
    public ContaBancaria(){
        this.titular = "";
        this.saldo = 0.0;
    }

    //Construtor parametrizado
    public ContaBancaria(String titular, double saldoInicial){
        this();
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    //Métodos
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true; //Saque bem-sucedido
        } else {
            return false; //Saque inválido
        }
    }

    public double getSaldo(){
        return saldo;
    }


    @Override
    public String toString(){
        return "Conta Bancária: Titular = " + titular + ", Saldo = " + saldo;
    }

}
