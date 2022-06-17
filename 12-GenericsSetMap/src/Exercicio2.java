import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String caminhoDoArquivo = "D:\\Cursos\\DevSuperiorJavaExercicios\\12-GenericsSetMap\\src\\votos.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            Map<String, Integer> hashMap = new LinkedHashMap<>();

            String linha = reader.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                String nome = campos[0];
                int votos = Integer.parseInt(campos[1]);

                if (hashMap.containsKey(nome)) {
                    int votosAteAgora = hashMap.get(nome);
                    hashMap.put(nome, votos + votosAteAgora);
                } else {
                    hashMap.put(nome, votos);
                }

                linha = reader.readLine();
            }

            for (String s : hashMap.keySet()) {
                System.out.printf("Chave: %s Valor: %d\n", s, hashMap.get(s));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

