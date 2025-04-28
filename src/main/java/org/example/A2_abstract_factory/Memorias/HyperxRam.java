package org.example.A2_abstract_factory.Memorias;

public class HyperxRam implements MemoriaRam{
    @Override
    public void capacidadeRam(int tamanho) {
        System.out.printf("Criando Memoria RAM da HyperX com o tamanho %dGB%n", tamanho);
    }
}
