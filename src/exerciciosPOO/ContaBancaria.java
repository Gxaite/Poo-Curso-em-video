package exerciciosPOO;

class ContaBancaria {
    double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void realizarDeposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }
}