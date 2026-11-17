public class TesteConta {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);

        conta.sacar(30);
        System.out.println("Saldo atual: " + conta.getSaldo());

        try {
            conta.sacar(500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
