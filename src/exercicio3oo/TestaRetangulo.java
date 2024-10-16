package exercicio3oo;

public class TestaRetangulo {
    public static void main(String[] args) {

        // Teste 1: Criando um retângulo com os lados válidos
        Retangulo ret1 = new Retangulo(5.0, 3.0);
        System.out.println(ret1); // Deve exibir a largura, altura e área do retângulo


        // Teste 2: Testando um retângulo com um dos lados negativos (não deve aceitar)
        Retangulo ret2 = new Retangulo(-2.0, 4.0);
        System.out.println(ret2); // A largura negativa deve ser ignorada, área deve ser 0


        // Teste 3: Atualizando os lados para valores válidos
        ret2.setLargura(4.0);
        ret2.setAltura(2.0);
        System.out.println(ret2); // Deve exibir a nova largura, altura e área


        // Teste 4: Verificando um retângulo com lados zero
        Retangulo ret3 = new Retangulo(0, 0);
        System.out.println(ret3); // A área deve ser 0
    }


}
