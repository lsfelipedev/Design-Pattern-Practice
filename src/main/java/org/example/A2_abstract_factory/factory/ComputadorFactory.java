package org.example.A2_abstract_factory.factory;

import org.example.A2_abstract_factory.Memorias.MemoriaRam;
import org.example.A2_abstract_factory.Processador.GPU;

public interface ComputadorFactory {
    MemoriaRam criarMemoriaRam();
    GPU criarGpu();

}
