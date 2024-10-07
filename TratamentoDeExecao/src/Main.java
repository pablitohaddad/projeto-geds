public class Main {
    public static void main(String[] args) {
        // O codigo vai tentar
        try {
            int[] numeros = {1, 2, 3}; // 0, 1, 2
            System.out.println(numeros[4]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }
}