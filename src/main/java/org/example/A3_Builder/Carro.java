package org.example.A3_Builder;

public class Carro {
    private String placa;
    private String cor;
    private String modelo;
    private String marca;
    private int portasTotal;
    private Long kmCorrido;
    private boolean temTurbo;


    private Carro(CarroBuilder carroBuilder) {
        this.placa = carroBuilder.placa;
        this.cor = carroBuilder.cor;
        this.modelo = carroBuilder.modelo;
        this.marca = carroBuilder.marca;
        this.portasTotal = carroBuilder.portasTotal;
        this.kmCorrido = carroBuilder.kmCorrido;
        this.temTurbo = carroBuilder.temTurbo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPortasTotal() {
        return portasTotal;
    }

    public void setPortasTotal(int portasTotal) {
        this.portasTotal = portasTotal;
    }

    public Long getKmCorrido() {
        return kmCorrido;
    }

    public void setKmCorrido(Long kmCorrido) {
        this.kmCorrido = kmCorrido;
    }

    public boolean isTemTurbo() {
        return temTurbo;
    }

    public void setTemTurbo(boolean temTurbo) {
        this.temTurbo = temTurbo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", portasTotal=" + portasTotal +
                ", kmCorrido=" + kmCorrido +
                ", temTurbo=" + temTurbo +
                '}';
    }

    public static CarroBuilder Builder(){
        return new CarroBuilder();
    }

    public static class CarroBuilder{
        private String placa;
        private String cor;
        private String modelo;
        private String marca;
        private int portasTotal;
        private Long kmCorrido;
        private boolean temTurbo;

        private CarroBuilder(){}


        public CarroBuilder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public CarroBuilder cor(String cor) {
            this.cor = cor;
            return this;
        }

        public CarroBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarroBuilder portasTotal(int portasTotal) {
            this.portasTotal = portasTotal;
            return this;
        }

        public CarroBuilder kmCorrido(Long kmCorrido) {
            this.kmCorrido = kmCorrido;
            return this;
        }

        public CarroBuilder temTurbo(boolean temTurbo) {
            this.temTurbo = temTurbo;
            return this;
        }

        public Carro build(){
            return new Carro(this);
        }
    }
}
