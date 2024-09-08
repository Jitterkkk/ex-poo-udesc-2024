package exercicio1oo;

public class ContaBancaria {
    public String numeroConta;
    public double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    public void depositar (double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        }
    }
    public double maisSaldo(){
        return saldo;
    }
    @Override
    public String toString(){
        return "ContaBancaria{" +
                "número da conta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
