import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.printf("Soma Impares = %d", soma);

        scanner.close();
    }
}
