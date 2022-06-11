package desafio.aplicacao;

import desafio.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu sexo F ou M: ");
        char genero = scanner.next().toUpperCase().charAt(0);
        System.out.print("Quantas cervejas foram consumidas: ");
        int qtdCervejas = scanner.nextInt();
        System.out.print("Quantas refrigerantes foram consumidos: ");
        int qtdRefrigerantes = scanner.nextInt();
        System.out.print("Quantas espetinhos foram consumidos: ");
        int qtdEspetinhos = scanner.nextInt();

        Conta conta = new Conta(genero, qtdCervejas, qtdEspetinhos, qtdRefrigerantes);

        System.out.println();
        System.out.println(conta);

        scanner.close();
    }
}
