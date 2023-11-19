/*
 * Exercício 11: Advinhando Números com do...while

Desenvolva um jogo simples em que o computador escolhe um número aleatório entre 1 e 10, e o jogador deve adivinhar o número. Use uma estrutura de repetição do...while para permitir que o jogador continue adivinhando até acertar. Forneça feedback sobre se a tentativa está correta ou se o jogador deve tentar novamente.

Exemplo:

Adivinhe o número entre 1 e 10.
Tentativa 1: 5
Tente novamente. O número é maior.
Tentativa 2: 8
Parabéns! Você acertou o número 8 em 2 tentativas.

 */
package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		int numeroAleatorio = (int) (Math.random() * 10) + 1;

        int tentativas = 0;
        do {

            int tentativa = obterTentativa();


            tentativas++;
            
            if (tentativa == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
                break;
                
            } else {
                if (tentativa < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor.");
                }
            }

        } while (true);
    }

    private static int obterTentativa() {
        String inputTentativa = JOptionPane.showInputDialog("Adivinhe o número entre 1 e 10.\nTentativa:");
        return Integer.parseInt(inputTentativa);
    }
}


