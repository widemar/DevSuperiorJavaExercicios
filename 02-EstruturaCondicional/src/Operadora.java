import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int quantidadeDeMinutos = scanner.nextInt();

        double valorTotal = quantidadeDeMinutos <= 100 ? 50.00 : ((quantidadeDeMinutos - 100) * 2) + 50.00;

        System.out.printf("Valor a pagar: R$%.2f", valorTotal);

        scanner.close();
    }
}
