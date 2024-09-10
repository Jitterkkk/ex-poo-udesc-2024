package exercicio2oo;

public class TesteContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria(1000.0);

        conta.depositar(500.0);
        conta.sacar(200.0);

        System.out.println("Saldo atual: "+ conta.getSaldo());
    }
}
