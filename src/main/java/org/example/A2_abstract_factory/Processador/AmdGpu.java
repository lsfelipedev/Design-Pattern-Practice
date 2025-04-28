package org.example.A2_abstract_factory.Processador;

public class AmdGpu implements GPU{
    @Override
    public void velocidadeGpu(float velocidade) {
        System.out.printf("Criando Processador AMD com a velocidade de %.1fGhz\n", velocidade);
    }
}
