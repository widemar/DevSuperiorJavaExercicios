import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três distâncias: ");
        double distancia1 = scanner.nextDouble();
        double distancia2 = scanner.nextDouble();
        double distancia3 = scanner.nextDouble();

        double maior = distancia1 > distancia2 && distancia1 > distancia3 ?
                distancia1 :
                Math.max(distancia2, distancia3);

        System.out.printf("Maior distância = %.2f", maior);

        scanner.close();
    }
}
