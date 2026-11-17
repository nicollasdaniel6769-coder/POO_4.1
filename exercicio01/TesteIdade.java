public class TesteIdade {

    public static void main(String[] args) {
        try {
            ValidadorIdade.verificarIdade(20);
            ValidadorIdade.verificarIdade(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
