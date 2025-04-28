package org.example.A1_factory_method.treinamento;

public class CarroAzulFactory extends CarroFactory{
    @Override
    public Carro carroEscolhido() {
        return new CarroAzul();
    }
}
