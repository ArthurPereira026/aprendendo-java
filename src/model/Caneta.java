package model;

public class Caneta {
    //Atributos
    private String cor;
    private double ponta;
    private boolean tampado;
    private boolean carga;
    private String material;

    public Caneta(){}

    public Caneta(String cor, double ponta, boolean tampado, boolean carga, String material) {
        this.cor = cor;
        this.ponta = ponta;
        this.tampado = tampado;
        this.carga = carga;
        this.material = material;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public boolean isTampado() {
        return tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    public boolean isCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}

