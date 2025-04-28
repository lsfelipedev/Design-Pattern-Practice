package org.example.A1_factory_method.treinamento2;

public class FabricaBaunilha extends FabricaDeBolo{
    @Override
    public Bolo criarBolo() {
        return new BoloBaunilha();
    }
}
