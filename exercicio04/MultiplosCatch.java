import java.util.Scanner;

public class MultiplosCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30};

        try {
            System.out.print("Digite o índice do array (0 a 2): ");
            int indice = sc.nextInt();
            System.out.print("Digite o divisor: ");
            int divisor = sc.nextInt();

            int resultado = numeros[indice] / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: esse índice não existe no array.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        }

        sc.close();
    }
}
