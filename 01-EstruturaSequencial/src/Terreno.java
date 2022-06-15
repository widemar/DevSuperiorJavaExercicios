import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        double valor = scanner.nextDouble();

        double areaDoTerreno = largura * comprimento;
        double precoDoTerreno = valor * areaDoTerreno;

        System.out.printf("Area do terreno = %.2f\n", areaDoTerreno);
        System.out.printf("Preço do terreno = %.2f", precoDoTerreno);

        scanner.close();
    }
}

