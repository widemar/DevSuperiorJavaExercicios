import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor: ");
        int valor = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", valor, i, valor * i);
        }

        scanner.close();
    }
}
