/*
 * Exercício 10: Contagem Regressiva com while

Crie um programa que use uma estrutura de repetição while para realizar uma contagem regressiva a partir de um número fornecido pelo usuário até 1. Imprima cada número durante a contagem.

Exemplo:

Digite um número inicial: 5
5
4
3
2
1

 */
package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
        int numeroInicial = obterNumeroInicial();

        realizarContagemRegressiva(numeroInicial);
    }

    private static int obterNumeroInicial() {
        String inputNumeroInicial = JOptionPane.showInputDialog("Digite um número inicial:");
        return Integer.parseInt(inputNumeroInicial);
    }

    private static void realizarContagemRegressiva(int numeroInicial) {
        int contador = numeroInicial;

        while (contador >= 1) {
            System.out.println(contador);

            contador--;
        }
		
	}

}
