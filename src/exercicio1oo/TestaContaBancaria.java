package exercicio1oo;

public class TestaContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("654321", 1000.0);

        System.out.println(conta);

        conta.depositar(500.0);
        System.out.println("Após depósito: " + conta);

        conta.sacar(200.0);
        System.out.println("Após saque: " + conta);
        System.out.println("Saldo atual: " + conta.maisSaldo());
    }
}
