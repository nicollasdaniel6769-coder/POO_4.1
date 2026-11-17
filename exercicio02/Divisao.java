import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = sc.nextInt();

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }

        sc.close();
    }
}
