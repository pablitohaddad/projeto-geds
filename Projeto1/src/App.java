
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Chama a classe Scanner para entrada de dados do telcado
        Scanner sc = new Scanner(System.in);
        // Dados de usuários: Nome, idade, telefone

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");

        int idade = sc.nextInt();
        
        // Consome a linha para que não pule telefone
        sc.nextLine();
        
        System.out.println("Digite o seu telefone");
        String telefone = sc.nextLine();
        
        System.out.println("DADOS ABAIXO:");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(telefone);

        sc.close();

    }
}
