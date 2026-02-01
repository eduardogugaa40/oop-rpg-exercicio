public class Guerreiro extends Personagem{

    Guerreiro() {

    }

    Guerreiro(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou com uma espada!");
    }
}
