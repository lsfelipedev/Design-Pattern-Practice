package org.example.A5_Siglenton.LazyWithThreadSafe;

public class Main {
    public static void main(String[] args) {

        Configuracoes cfg = Configuracoes.getINSTANCIA("2.5");
        System.out.println(cfg);
        System.out.println(cfg.hashCode());
        Configuracoes cfg2 = Configuracoes.getINSTANCIA("4.5");
        System.out.println(cfg2);
        System.out.println(cfg2.hashCode());
    }
}
