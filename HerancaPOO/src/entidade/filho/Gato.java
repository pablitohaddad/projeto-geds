package entidade.filho;

import entidade.Animal;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau miau miau miau miau miau");
    }
}
