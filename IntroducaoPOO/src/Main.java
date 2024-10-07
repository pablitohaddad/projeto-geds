import entidade.Pessoa;

public class Main {
    public static void main(String[] args) {

        // Instancias da minha classe
        Pessoa pessoa1 = new Pessoa("Fabiano", 1.80f, "Castanho");
        Pessoa pessoaDesconhecida = new Pessoa();

        pessoa1.imprimirPessoa();
        pessoaDesconhecida.imprimirPessoa();
    }
}