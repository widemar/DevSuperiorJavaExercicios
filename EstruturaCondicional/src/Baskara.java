import java.util.Locale;
import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = (Math.pow(b, 2.0) - (4 * a * c));
        double x1 = (-b + Math.sqrt(delta)) /  (2 * a);
        double x2 = (-b - Math.sqrt(delta)) /  (2 * a);

        if (delta < 0){
            System.out.println("Esta equação não possui raízes reais");
        } else {
            System.out.printf("X1 = %.4f\n", x1);
            System.out.printf("X2 = %.4f\n", x2);
        }

        scanner.close();
    }
}
