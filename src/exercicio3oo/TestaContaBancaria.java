package exercicio3oo;
import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados iniciais da conta bancária
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Criando a conta bancária com os dados informados
        ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial);

        // Menu interativo
        int opcao;
        do {
            System.out.println("\n--- Menu Conta Bancária ---");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Switch é usado pra dar "opção"
            switch (opcao) {
                case 1:
                    // Verificar o saldo
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;

                case 2:
                    // Depósito
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);  // Depósito sem retorno de valor booleano
                    System.out.println("Depósito realizado. Saldo atual: " + conta.getSaldo());
                    break;

                case 3:
                    // Saque
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque realizado. Saldo atual: " + conta.getSaldo());
                    } else {
                        System.out.println("Saque inválido. Saldo insuficiente ou valor negativo.");
                    }
                    break;

                case 4:
                    // Sair
                    System.out.println("Saindo...");
                    // Ele interrompe a execução dentro do switch-case e faz com que o fluxo do programa continue após o switch.
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
