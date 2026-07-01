import heranca.Aviao;
import heranca.Carro;
import heranca.Motocicleta;
import heranca.Transporte;

public class ManipulandoTransporte {
    public static void main(String[] args) {

        Transporte Fusca = new Carro("Gtr", "Volks", "Fusca",1890, 6000,true);

        Transporte Ninja = new Motocicleta("S100","Kawasaki", "Ninja",1900, 60000, true);

        Transporte aviao = new Aviao("VoaVoa","Boing","Boing777", 1895,150000,true);

    }
}
