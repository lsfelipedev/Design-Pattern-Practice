package org.example.A2_abstract_factory.Memorias;

public class CorsairRam implements MemoriaRam{
    @Override
    public void capacidadeRam(int tamanho) {
        System.out.printf("Criando Memoria RAM da Corsair com o tamanho %dGB%n", tamanho);
    }
}
