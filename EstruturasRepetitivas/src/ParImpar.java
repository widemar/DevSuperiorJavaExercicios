import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtd = scanner.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("Nulo");
            } else if (num % 2 == 0) {
                System.out.println(num > 0 ? "Par positivo" : "Par Negativo");
            } else {
                System.out.println(num > 0 ? "Impar positivo" : "Impar negativo");
            }
        }

        scanner.close();
    }
}
