import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você vai digitar a temperatura em qual escala (C ou F): ");
        char temperatura = scanner.next().toUpperCase().charAt(0);

        switch (temperatura) {
            case 'C' -> {
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();

                double celsiusParaFahrenheit = celsius * 1.8 + 32;
                System.out.printf("Temperatura equivalente em fahrenheit: %.2f", celsiusParaFahrenheit);
            }
            case 'F' -> {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();

                double fahrenheitParaCelsius = (fahrenheit - 32) / 1.8;
                System.out.printf("Temperatura equivalente em celsius: %.2f", fahrenheitParaCelsius);
            }
            default -> System.out.println("Temperatura inválida");
        }

        scanner.close();
    }
}
