public class Main {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem("Mario", 100);
        Personagem personagem2 = new Mago("Degelo", 150);
        Personagem personagem3 = new Guerreiro("Principe", 200);

        personagem1.atacar();
        personagem2.atacar();
        personagem3.atacar();

    }
}