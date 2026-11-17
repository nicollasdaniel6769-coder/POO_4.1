public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar R$ " + valor);
        }
        saldo -= valor;
    }
}
