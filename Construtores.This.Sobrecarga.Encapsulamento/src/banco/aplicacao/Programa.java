package banco.aplicacao;

import banco.entidades.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ContaBancaria contaBancaria;

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();
        System.out.print("Digite o titular da conta: ");
        scanner.nextLine();
        String titular = scanner.nextLine();
        System.out.print("Existe um depósito inicial (s/n)? ");
        char escolha = scanner.next().toLowerCase().charAt(0);

        if (escolha == 's') {
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInicial = scanner.nextDouble();
            contaBancaria = new ContaBancaria(numeroDaConta, titular, depositoInicial);
        } else {
            contaBancaria = new ContaBancaria(numeroDaConta, titular);
        }

        System.out.println("Dados da conta:");
        System.out.println(contaBancaria);

        System.out.print("Insira um valor de depósito: ");
        double deposito = scanner.nextDouble();
        contaBancaria.depositar(deposito);
        System.out.println("Dados da conta atualizados:");
        System.out.println(contaBancaria);

        System.out.print("Insira um valor de retirada: ");
        double saque = scanner.nextDouble();
        contaBancaria.sacar(saque);
        System.out.println("Dados da conta atualizados:");
        System.out.println(contaBancaria);

        scanner.close();
    }
}
