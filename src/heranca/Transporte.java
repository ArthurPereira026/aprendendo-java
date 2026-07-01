package heranca;

public class Transporte {

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;
    private boolean isOn;
    private double custoManutencao;
    private int anoFabricacao;
    private double preco;



    public Transporte(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isOn) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.isOn = isOn;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getCustoManutencao() {
        return custoManutencao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public double getPreco() {
        return preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }


    public void ligar(){
        this.isOn = true;
        System.out.println("Ligando Motores..");
    }

    public void desligar(){
        this.isOn = false;
        System.out.println("Desligando Motores..");
    }

    public void acelerar(){

    }

    public void desacelerar(){
        System.out.println("Freando...");
    }

    public double calcularSeguro(){
        return preco*0.1;
    }


}

