import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite a medida B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite a medida C: ");
        double c = scanner.nextDouble();

        double areaQuadrado = Math.pow(a, 2.0);
        double areaTriangulo = a * b;
        double areaTrapezio = ((a + b) * c) / 2;

        System.out.printf("Area do quadrado = %.4f\n", areaQuadrado);
        System.out.printf("Area do triângulo = %.4f\n", areaTriangulo);
        System.out.printf("Area do trapézio = %.4f\n", areaTrapezio);

        scanner.close();
    }
}
