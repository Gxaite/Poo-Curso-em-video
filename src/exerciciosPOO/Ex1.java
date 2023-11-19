package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		String inputConta = JOptionPane.showInputDialog("Digite o valor total da conta:");
        double valorConta = Double.parseDouble(inputConta);

        String inputPorcentagem = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar:");
        double porcentagemGorjeta = Double.parseDouble(inputPorcentagem);

        double valorGorjeta = (porcentagemGorjeta / 100) * valorConta;
        double totalPagar = valorConta + valorGorjeta;

        String mensagem = String.format("Valor da gorjeta: $%.2f\nTotal a ser pago: $%.2f", valorGorjeta, totalPagar);

        JOptionPane.showMessageDialog(null, mensagem);
	}

}
