package exercicio1oo;

public class TestaCarro {
    public static void main(String[] args){
        Carro carro = new Carro("LancerDeMalandro");

        System.out.println(carro);
        carro.acelerar();
        System.out.println("Após acelerar VRUUUUMMMM        : " + carro);
        carro.acelerar();
        System.out.println("Após acelerar mais vezes: " + carro);

        carro.frear();
        System.out.println("Após frear: " + carro);

        carro.frear();
        carro.frear();
        System.out.println("Após frear completamente: " + carro);

    }
}
