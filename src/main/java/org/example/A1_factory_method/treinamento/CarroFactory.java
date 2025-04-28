package org.example.A1_factory_method.treinamento;

public abstract class CarroFactory {

    public void construindoCarro(){
        Carro carro = carroEscolhido();
        carro.criarCarro();
    }

    abstract Carro carroEscolhido();
}
