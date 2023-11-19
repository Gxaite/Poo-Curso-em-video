package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		int numero = obterNumero();

        exibirTabelaMultiplicacao(numero);
    }

    private static int obterNumero() {
        String inputNumero = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação:");
        return Integer.parseInt(inputNumero);
    }

    private static void exibirTabelaMultiplicacao(int numero) {
        JOptionPane.showMessageDialog(null, "Tabela de multiplicação para " + numero + ":\n" + obterMultiplicacaoFormatada(numero));
    }

    private static String obterMultiplicacaoFormatada(int numero) {
        StringBuilder tabela = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabela.append(i).append(" x ").append(numero).append(" = ").append(resultado).append("\n");
        }

        return tabela.toString();
    }

}
