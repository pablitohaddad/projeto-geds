
import Entidade.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Criar um Objeto Pessoa
        Pessoa pessoa = new Pessoa("Pablo", 19, "03955922234", 'M');
        
        pessoa.exibirInformacoes();

        if(pessoa.isMaiorDeIdade()){
            System.out.println("A pessoa é maior de idade");
        }else{
            System.out.println("A pessoa é menor de idade");
        }

    }
}
