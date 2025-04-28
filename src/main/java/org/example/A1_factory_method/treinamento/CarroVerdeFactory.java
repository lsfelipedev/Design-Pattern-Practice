package org.example.A1_factory_method.treinamento;

public class CarroVerdeFactory extends CarroFactory{
    @Override
    public Carro carroEscolhido() {
        return new CarroVerde();
    }
}
