public class Mago extends Personagem{

    Mago(){
    }

    Mago (String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou com magia!");
    }
}
