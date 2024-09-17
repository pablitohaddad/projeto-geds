public class App {
    public static void main(String[] args) throws Exception {
        // Nome, idade, altura, inicialNome, maiorDeIdade
        String nome = "Pablo";
        int idade = 19; // 19 != "19"
        float altura = 1.76f;
        char inicialNome = 'P';
        boolean maiorDeIdade; // true ou false 

        if(idade >= 18){
            maiorDeIdade = true;
        } else {
            maiorDeIdade = false;
        }
        
        System.out.println("SEUS DADOS A BAIXO:");
        System.out.println(nome); // Pablo
        System.out.println(idade); // 19
        System.out.println(altura); // 1.76
        System.out.println(inicialNome); // P
        System.out.println(maiorDeIdade); // true

        System.out.println("CONTAGEM DA SUA IDADE:");

        for(int i = 0; i <= idade; i++){
            //0
            //1
            //2
            //...
            //19
            System.out.println(i);
        }

    }
}
