import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0){
            throw new ArithmeticException("Não tente dividir por 0, cabeçudo!");
        }
        int resultado = a / b;
        System.out.println(resultado);
    }
}