/*
 Exercício 1: Calculadora de Gorjeta

Crie um programa que solicite ao usuário o valor total de uma conta de restaurante e a porcentagem de gorjeta que deseja deixar. Em seguida, o programa deve calcular o valor da gorjeta e o valor total a ser pago (conta + gorjeta) e exibi-los na tela. Certifique-se de formatar a saída de forma adequada.

Exemplo de saída:

Digite o valor total da conta: 50.75
Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%): 15
Valor da gorjeta: $7.61
Total a ser pago: $58.36

 */

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
