package org.example.A2_abstract_factory;

import org.example.A2_abstract_factory.factory.AmdGpuCorsairFactory;
import org.example.A2_abstract_factory.factory.IntelGpuHyperxFactory;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente(new AmdGpuCorsairFactory());
        cliente01.criarComputador(5.2f, 64);

        System.out.println();

        Cliente cliente02 = new Cliente(new IntelGpuHyperxFactory());
        cliente02.criarComputador(4.6f, 32);
    }
}
