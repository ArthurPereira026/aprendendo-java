package heranca;

public class Aviao extends Transporte{

    private final int LIMITE_VELOCIDADE = 463;

    public Aviao(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isOn) {
        super(nome, marca, modelo, anoFabricacao, preco, isOn);
    }

    @Override
    public void acelerar() {
        System.out.printf("A velocidade máxima de um avião é de {}KM por hora", LIMITE_VELOCIDADE);
        super.acelerar();
    }
    public void voar(){
        System.out.println("Voando...");
    }
    public void decolar(){
        System.out.println("Decolando...");

    }
    public void pousar(){
        System.out.println("Pousando...");
    }
}
