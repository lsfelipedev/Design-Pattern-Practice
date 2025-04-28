package org.example.A1_factory_method.treinamento;

public class Principal {
    public static void main(String[] args) {
        CarroFactory carro = new CarroVermelhoFactory();
        carro.construindoCarro();
    }
}
