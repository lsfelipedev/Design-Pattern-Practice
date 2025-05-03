package org.example.A3_Builder;

public class Main {
    public static void main(String[] args) {

        Carro build = Carro.Builder()
                .marca("porsche")
                .cor("vermelha")
                .placa("21JAKA22")
                .portasTotal(4)
                .kmCorrido(250L)
                .modelo("911")
                .temTurbo(true)
                .build();

        Carro build2 = Carro.Builder()
                .marca("ferrari")
                .cor("vermelha")
                .placa("AKO1343")
                .portasTotal(2)
                .kmCorrido(50L)
                .modelo("296 GYS")
                .temTurbo(true)
                .build();

        System.out.println("carro 1: " + build);
        System.out.println("carro 2: " + build2);
    }
}
