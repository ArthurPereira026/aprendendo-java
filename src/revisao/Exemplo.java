package revisao;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //System.out.println("Digite o número que você quer na tabuada: ");
        //int num = leia.nextInt();

        for(int i =1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
            System.out.printf("%d x %d = %d\n", i, j, i*j);
                }
        }
    }
}