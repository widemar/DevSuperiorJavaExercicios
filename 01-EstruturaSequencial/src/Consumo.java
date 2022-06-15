import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância percorrida: ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.print("Combustível gasto: ");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.printf("Consumo médio %.3f", consumoMedio);

        scanner.close();
    }
}
