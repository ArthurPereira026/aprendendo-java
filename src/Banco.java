import heranca.Conta;
import heranca.ContaCorrente;
import heranca.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente(1001, 9988775, "Arthur",50.00,true);

        Conta contaPoupanca = new ContaPoupanca(1001, 1199664,"Arthur",100.00,true);

        System.out.println("------------------------------------------------------");
        System.out.println("Saldo Conta Corrente");
        System.out.printf("Saldo inicial CC: %.2f\n",contaCorrente.getSaldo());
        contaCorrente.depositar(950);
        contaCorrente.sacar(500);
        System.out.printf("Saldo Final CC: %.2f\n",contaCorrente.getSaldo());

        System.out.println(" ");

        System.out.println("------------------------------------------------------");
        System.out.println("Saldo conta Poupança");
        System.out.printf("saldo Inicial Conta Poupança: %.2f\n",contaPoupanca.getSaldo());
        contaPoupanca.depositar(900);
        contaPoupanca.sacar(500);
        System.out.printf("Saldo Final Conta Poupança: %.2f\n",contaPoupanca.getSaldo());

    }
}
