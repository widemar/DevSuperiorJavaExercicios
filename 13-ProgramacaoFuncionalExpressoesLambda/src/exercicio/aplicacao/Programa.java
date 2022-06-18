package exercicio.aplicacao;

import exercicio.entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String caminho =
                "D:\\Cursos\\DevSuperiorJavaExercicios\\13-ProgramacaoFuncionalExpressoesLambda\\" +
                        "src\\exercicio\\entidades\\funcionarios.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            List<Funcionario> funcionarios = new ArrayList<>();

            String linha = reader.readLine();

            while (linha != null) {
                String[] vetorDeFuncionarios = linha.split(",");
                String nome = vetorDeFuncionarios[0];
                String email = vetorDeFuncionarios[1];
                double salario = Double.parseDouble(vetorDeFuncionarios[2]);
                funcionarios.add(new Funcionario(nome, email, salario));
                linha = reader.readLine();
            }

            List<String> salariosMaioresQue2000 = funcionarios
                    .stream()
                    .filter(funcionario -> funcionario.getSalario() > 2000.00)
                    .map(Funcionario::getEmail)
                    .sorted().toList();

            System.out.println("Email de pessoas cujo salário é superior a 2000.00:");
            for (String nome : salariosMaioresQue2000) {
                System.out.println(nome);
            }

            double somaSalariosDeFuncionariosComM = funcionarios
                    .stream()
                    .filter(funcionario -> funcionario.getNome().charAt(0) == 'M')
                    .map(Funcionario::getSalario).reduce(0.0, Double::sum);

            System.out.printf(
                    "Soma do salário das pessoas cujo nome começa com 'M': %.2f",
                    somaSalariosDeFuncionariosComM
            );

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}
