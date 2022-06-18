package desafio2.aplicacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String caminho = "D:\\Cursos\\DevSuperiorJavaExercicios\\" +
                "13-ProgramacaoFuncionalExpressoesLambda\\src\\desafio2\\base-de-dados.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            Map<String, Double> vendas = new HashMap<>();

            String linha = reader.readLine();
            while (linha != null) {
                String[] vetor = linha.split(",");
                String vendedor = vetor[2];
                double total = Double.parseDouble(vetor[4]);
                if (vendas.containsKey(vendedor)) {
                    double totalTemporario = vendas.get(vendedor);
                    vendas.put(vendedor, total + totalTemporario);
                } else {
                    vendas.put(vendedor, total);
                }
                linha = reader.readLine();
            }

            System.out.println("Total de vendas por vendedor:");
            for (String chave : vendas.keySet()) {
                System.out.printf("%s - R$ %.2f\n", chave, vendas.get(chave));
            }

        } catch (FileNotFoundException e) {
            System.out.printf("Erro: %s", e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
