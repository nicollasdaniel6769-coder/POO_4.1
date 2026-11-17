public class TesteConta {

    public static void realizarSaque(ContaBancaria conta, double valor) throws SaldoInsuficienteException {
        conta.sacar(valor);
        System.out.println("Saque de R$ " + valor + " realizado. Saldo: " + conta.getSaldo());
    }

    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaBancaria conta = new ContaBancaria(100);

        realizarSaque(conta, 30);
        realizarSaque(conta, 500);
    }
}
