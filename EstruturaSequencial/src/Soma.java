import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        int soma = x + y;

        System.out.printf("Soma = %d", soma);

        scanner.close();
    }
}
