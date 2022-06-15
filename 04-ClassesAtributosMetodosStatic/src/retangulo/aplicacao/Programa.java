package retangulo.aplicacao;

import retangulo.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a largura e altura do retângulo:");
        double largura = scanner.nextDouble();
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.println(retangulo);

        scanner.close();
    }
}
