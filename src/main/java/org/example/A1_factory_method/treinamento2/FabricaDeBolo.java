package org.example.A1_factory_method.treinamento2;

public abstract class FabricaDeBolo {

    public void preparandoBolo(){
        Bolo saborBolo = criarBolo();
        saborBolo.assar();
    }

    public abstract Bolo criarBolo();
}