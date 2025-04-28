package org.example.A2_abstract_factory.factory;

import org.example.A2_abstract_factory.Memorias.HyperxRam;
import org.example.A2_abstract_factory.Memorias.MemoriaRam;
import org.example.A2_abstract_factory.Processador.GPU;
import org.example.A2_abstract_factory.Processador.IntelGpu;


public class IntelGpuHyperxFactory implements ComputadorFactory{

    @Override
    public MemoriaRam criarMemoriaRam() {
        return new HyperxRam();
    }

    @Override
    public GPU criarGpu() {
        return new IntelGpu();
    }
}
