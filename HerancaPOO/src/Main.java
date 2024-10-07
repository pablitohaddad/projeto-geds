import entidade.filho.Cachorro;
import entidade.filho.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 18);
        Gato gato = new Gato("Arnold Swacajsdghas", 90);

        System.out.println("Nome do gato: " + gato.getNome());
        System.out.println("Idade do gato: " + gato.getIdade());
        gato.emitirSom();

        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Idade do cachorro: " + cachorro.getIdade());
        cachorro.emitirSom();

    }
}