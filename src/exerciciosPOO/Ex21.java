package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex21 {

	public static void main(String[] args) {
		ContaBancaria conta = criarContaBancaria();

        exibirSaldo("Saldo inicial", conta);

        realizarDeposito(conta);

        exibirSaldo("Saldo após depósito", conta);
    }

    private static ContaBancaria criarContaBancaria() {
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta"));
        return new ContaBancaria(saldoInicial);
    }

    private static void realizarDeposito(ContaBancaria conta) {
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        conta.realizarDeposito(valorDeposito);
    }

    private static void exibirSaldo(String titulo, ContaBancaria conta) {
        JOptionPane.showMessageDialog(null, titulo + ": Saldo: " + conta.saldo);
    }

}

