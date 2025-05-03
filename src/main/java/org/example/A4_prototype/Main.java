package org.example.A4_prototype;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("ferrari", "296 GTS", "S2A4531");
        Carro carro2 = carro.clone();

        System.out.println(carro);
        System.out.println(carro2);



    }
}
