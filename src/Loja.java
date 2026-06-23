import model.Produto;

public class Loja {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Precision 7",499.90,20,"43");
        Produto produto2 = new Produto("Camisa do Brasil", 750.50,70,"GG");
        Produto produto3 = new Produto("Meião",15,80,"G");

        System.out.println("Estoque Atual");
        System.out.println(" ");
        produto1.mostrarEstoque();

        int retornoEstoque = produto1.adicionarAoEstoque(5);
        System.out.println(" ");

        System.out.println("Quantidade do estoque atualizado: " + retornoEstoque);
        System.out.println(" ");
        produto1.mostrarEstoque();


    }
}
