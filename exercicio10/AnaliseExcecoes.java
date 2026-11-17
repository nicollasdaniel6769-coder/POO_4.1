public class AnaliseExcecoes {

    public static void main(String[] args) {
        try {
            System.out.println("1. Bloco try externo iniciado.");
            try {
                System.out.println("2. Bloco try interno iniciado.");
                throw new NullPointerException("Erro interno proposital");
            } catch (ArithmeticException e) {
                System.out.println("3. Catch interno (ArithmeticException)");
            }
            System.out.println("4. Linha interna pós-try");
        } catch (NullPointerException e) {
            System.out.println("5. Catch externo capturou: " + e.getMessage());
        } finally {
            System.out.println("6. Bloco finally externo executado.");
        }
    }
}
