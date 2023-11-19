/*
 * Exercício 5: Conversor de Idade

Peça ao usuário para inserir sua idade em anos. Em seguida, converta essa idade para meses, dias, horas e minutos. Mostre o resultado formatado de maneira clara. Considere um ano com 365 dias.
 */
package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		int idadeAnos = obterIdade();

        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365; 
        int idadeHoras = idadeDias * 24;
        int idadeMinutos = idadeHoras * 60;

        String mensagem = String.format("Idade em anos: %d\nIdade em meses: %d\nIdade em dias: %d\nIdade em horas: %d\nIdade em minutos: %d",
                idadeAnos, idadeMeses, idadeDias, idadeHoras, idadeMinutos);

        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static int obterIdade() {
        String inputIdade = JOptionPane.showInputDialog("Digite sua idade em anos:");
        return Integer.parseInt(inputIdade);
    }
}
