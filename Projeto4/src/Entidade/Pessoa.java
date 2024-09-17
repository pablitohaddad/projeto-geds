package Entidade;

public class Pessoa {
    // Nome, idade, cpf, sexo
    // Atribuir atributos
    String nome;
    int idade;
    String cpf;
    char sexo; // M ou F

    public Pessoa(String nome, int idade, String cpf, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Sexo: " + sexo);
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

}
