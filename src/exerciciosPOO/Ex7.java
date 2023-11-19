package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		int numero = obterNumero();

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }

    private static int obterNumero() {
        String inputNumero = JOptionPane.showInputDialog("Digite um número inteiro:");
        return Integer.parseInt(inputNumero);
    }

}

