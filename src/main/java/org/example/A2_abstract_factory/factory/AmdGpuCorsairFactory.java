package org.example.A2_abstract_factory.factory;

import org.example.A2_abstract_factory.Memorias.CorsairRam;
import org.example.A2_abstract_factory.Memorias.MemoriaRam;
import org.example.A2_abstract_factory.Processador.AmdGpu;
import org.example.A2_abstract_factory.Processador.GPU;

public class AmdGpuCorsairFactory implements ComputadorFactory{
    @Override
    public MemoriaRam criarMemoriaRam() {
        return new CorsairRam();
    }

    @Override
    public GPU criarGpu() {
        return new AmdGpu();
    }
}
