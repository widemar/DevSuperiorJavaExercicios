import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        int fatorial = n;
        if (n == 0) {
            fatorial = 1;
        }
        for (int i = n - 1; i > 0; i--) {
            fatorial *= i;
        }

        System.out.printf("Fatorial = %d", fatorial);

        scanner.close();
    }
}
