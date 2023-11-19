/*
 * Exercício 7: Verificação de Números Pares e Ímpares

Crie um programa que solicita ao usuário para inserir um número inteiro. Em seguida, utilize uma estrutura if-else para verificar se o número é par ou ímpar. Imprima uma mensagem indicando o resultado.

Digite um número: 7 O número 7 é ímpar.

 */
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

