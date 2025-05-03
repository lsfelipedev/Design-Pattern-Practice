package org.example.A4_prototype;

public class Carro implements Cloneable{

    private String marca;
    private String modelo;
    private String placa;

    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public Carro clone() {
        try {
            return (Carro) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
