package org.example.A1_factory_method.treinamento2;

public class FabricaMorango extends FabricaDeBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloMorango();
    }
}
