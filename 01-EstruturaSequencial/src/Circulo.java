import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2.0);

        System.out.printf("Area = %.3f", area);

        scanner.close();
    }
}
