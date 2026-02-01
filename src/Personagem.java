public class Personagem {
    String nome;
    int vida = 100;

    Personagem() {
    }

    Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;

    }

    public void atacar() {
        System.out.println(this.nome + " atacou com um soco!");
    }
}
