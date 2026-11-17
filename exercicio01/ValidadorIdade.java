public class ValidadorIdade {

    public static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade não permitida: menor de idade");
        }
        System.out.println("Acesso liberado");
    }
}
