import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Lista com tamanho pre determinado
        int[] nomes = new int[10];
        Integer[] contas = new Integer[5];

        //lista que podem aumentar com o tempo

        List<String> listaAlunos = new ArrayList<>();
        listaAlunos.add("Arthur");
        listaAlunos.add("Jaqueline");
        listaAlunos.add("Amanda");
        listaAlunos.add("Luan");

        listaAlunos.forEach(i -> System.out.println(i));
        listaAlunos.forEach(System.out::println);

        List<Double> listaNotas = new ArrayList<>();
        listaNotas.add(9.5);
        listaNotas.add(9.0);
        listaNotas.add(8.5);

        double soma = 0;
        System.out.println(listaNotas.contains(9.0));


    }
}
