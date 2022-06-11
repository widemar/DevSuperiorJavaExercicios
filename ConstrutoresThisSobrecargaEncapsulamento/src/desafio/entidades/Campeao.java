package desafio.entidades;

public class Campeao {
    private final String nome;
    private Integer vida;
    private final Integer ataque;
    private final Integer armadura;

    public Campeao(String nome, Integer vida, Integer ataque, Integer armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public void levarDano(Campeao outroCampeao) {
        if (armadura >= outroCampeao.ataque) {
            vida -= 1;
        } else {
            vida = vida + armadura - outroCampeao.ataque;
        }
    }

    public void status() {
        if (vida <= 0) {
            vida = 0;
            System.out.printf("%s: %d de vida (morreu)\n", nome, vida);
        } else {
            System.out.printf("%s: %d de vida\n", nome, vida);
        }

    }
}
