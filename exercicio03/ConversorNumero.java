public class ConversorNumero {

    public static int converter(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("A conversão falhou: \"" + texto + "\" não é um número inteiro válido.");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Valor convertido: " + converter("123"));
        System.out.println("Valor convertido: " + converter("abc"));
        System.out.println("Valor convertido: " + converter("45x"));
    }
}
