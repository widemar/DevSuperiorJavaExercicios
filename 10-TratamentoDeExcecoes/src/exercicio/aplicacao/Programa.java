package exercicio.aplicacao;

import exercicio.modelo.entidades.Conta;
import exercicio.modelo.excecoes.DominioExcecao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter account data: ");
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            System.out.print("Titular: ");
            scanner.nextLine();
            String titular = scanner.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldoInicial = scanner.nextDouble();
            System.out.print("Limite de retirada: ");
            Double limiteDeRetirada = scanner.nextDouble();

            Conta conta = new Conta(numero, titular, saldoInicial, limiteDeRetirada);

            System.out.print("Insira o valor para saque: ");
            double quantia = scanner.nextDouble();
            conta.sacar(quantia);

            System.out.println(conta);
        } catch (DominioExcecao e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Número inválido");
        } catch (Exception e) {
            System.out.println("Erro desconhecido");
        }
    }
}
