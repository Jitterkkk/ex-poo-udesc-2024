package exercicio2oo;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        }
    }
}
