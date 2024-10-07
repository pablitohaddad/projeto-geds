package entidade;

public class Pessoa {
    // Tamanho, CorDosOlhos, Nome

    String nome;

    float tamanho;

    String corDosOlhos;

    public void imprimirPessoa(){
        System.out.println("Nome: " + nome + " Tamanho: "
                + tamanho + " Cor: " + corDosOlhos);
    }

    public Pessoa(){
        this.nome = "Desconhecido";
        this.tamanho = 0.0f;
        this.corDosOlhos = "Desconhecido";
    }

    public Pessoa(String nome, float tamanho, String corDosOlhos) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.corDosOlhos = corDosOlhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }
}
