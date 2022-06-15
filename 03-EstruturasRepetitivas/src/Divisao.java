import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos casos você vai digitar: ");
        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.print("Entre com o numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Entre com o denominador: ");
            int denominador = scanner.nextInt();

            if (denominador == 0) {
                System.out.println("Divisão Impossível");
            } else {
                double divisao = (double) numerador / denominador;
                System.out.printf("Divisão = %.2f\n", divisao);
            }
        }

        scanner.close();
    }
}
