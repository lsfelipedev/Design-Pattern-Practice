package org.example.A2_abstract_factory.Processador;

public class IntelGpu implements GPU{

    @Override
    public void velocidadeGpu(float velocidade) {
        System.out.printf("Criando Processador Intel com a velocidade de %.1fGhz\n", velocidade);
    }
}
