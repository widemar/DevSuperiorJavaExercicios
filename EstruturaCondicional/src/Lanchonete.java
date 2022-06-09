import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do produto comprado: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade comprada: ");
        double quantidadeComprada = scanner.nextDouble();

        double total = 0;
        switch (codigo) {
            case 1 -> total = quantidadeComprada * 5.00;
            case 2 -> total = quantidadeComprada * 3.50;
            case 3 -> total = quantidadeComprada * 4.80;
            case 4 -> total = quantidadeComprada * 8.90;
            case 5 -> total = quantidadeComprada * 7.32;
            default -> System.out.println("Código inválido");
        }

        System.out.printf("Valor a pagar: R$%.2f",total);

        scanner.close();
    }
}
