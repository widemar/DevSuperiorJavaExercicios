import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("Area = %.4f\n", area);
        System.out.printf("Perímetro = %.4f\n", perimetro);
        System.out.printf("Diagonal = %.4f\n", diagonal);

        scanner.close();
    }
}
