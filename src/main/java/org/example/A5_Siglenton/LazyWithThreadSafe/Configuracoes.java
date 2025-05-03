package org.example.A5_Siglenton.LazyWithThreadSafe;

public class Configuracoes {
    private static Configuracoes INSTANCIA;
    private final String versao;


    private Configuracoes(String versao) {
        this.versao = versao;
    }


    public static Configuracoes getINSTANCIA(String versao) {
        if (INSTANCIA == null) {
            synchronized (Configuracoes.class){
                if (INSTANCIA == null) {
                    INSTANCIA = new Configuracoes(versao);
                }
            }
        }
        return INSTANCIA;
    }

    @Override
    public String toString() {
        return "Configuracoes{" +
                "versao='" + versao + '\'' +
                '}';
    }
}