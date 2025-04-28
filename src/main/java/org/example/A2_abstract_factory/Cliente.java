package org.example.A2_abstract_factory;

import org.example.A2_abstract_factory.factory.ComputadorFactory;

public class Cliente{

    private ComputadorFactory factory;

    public Cliente(ComputadorFactory factory) {
        this.factory = factory;
    }

    public void criarComputador(float velocidadeGpu, int tamanhoRam){
        factory.criarGpu().velocidadeGpu(velocidadeGpu);
        factory.criarMemoriaRam().capacidadeRam(tamanhoRam);
    }
}
