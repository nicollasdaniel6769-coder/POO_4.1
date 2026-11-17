public class TesteConta {

    public static void main(String[] args) {
        Conta conta = new Conta(100);

        try {
            conta.depositar(50);
            System.out.println("Saldo após depósito: " + conta.getSaldo());

            conta.sacar(30);
            System.out.println("Saldo após saque: " + conta.getSaldo());

            conta.depositar(-10);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            conta.sacar(0);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
