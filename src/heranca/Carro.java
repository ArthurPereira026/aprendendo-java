package heranca;

public class Carro extends Transporte{

    private final int LIMITE_VELOCIDADE = 200;

    public Carro(String nome, String marca, String modelo, int anoFabricacao, double preco, boolean isOn) {
        super(nome, marca, modelo, anoFabricacao, preco, isOn);
    }


    @Override
    public void acelerar() {
        System.out.printf("A velocidade máxima de um carro é de {}KM por hora", LIMITE_VELOCIDADE);
        super.acelerar();
    }


}

