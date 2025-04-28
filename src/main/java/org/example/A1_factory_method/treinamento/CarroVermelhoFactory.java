package org.example.A1_factory_method.treinamento;

public class CarroVermelhoFactory extends CarroFactory{
    @Override
    public Carro carroEscolhido() {
        return new CarroVermelho();
    }
}
