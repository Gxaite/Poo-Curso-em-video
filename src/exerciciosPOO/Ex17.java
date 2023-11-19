/*
 * Exercício 16: Multiplicação de Matrizes

Desenvolva um programa que realiza a multiplicação de duas matrizes. A primeira matriz deve ter o número de colunas igual ao número de linhas da segunda matriz. As matrizes devem ser fornecidas pelo usuário.

Exemplo:

Digite o número de linhas da primeira matriz: 2
Digite o número de colunas da primeira matriz: 3

Digite os elementos da primeira matriz:
1 2 3
4 5 6

Digite o número de linhas da segunda matriz: 3
Digite o número de colunas da segunda matriz: 2

Digite os elementos da segunda matriz:
7 8
9 10
11 12

A multiplicação das matrizes é:
58 64
139 154

 */
package exerciciosPOO;
import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {

		        int linhasMatriz1 = obterNumero("Digite o número de linhas da primeira matriz:");
		        int colunasMatriz1 = obterNumero("Digite o número de colunas da primeira matriz:");

		        int[][] matriz1 = obterMatriz("Digite os elementos da primeira matriz:", linhasMatriz1, colunasMatriz1);


		        int linhasMatriz2 = obterNumero("Digite o número de linhas da segunda matriz:");
		        int colunasMatriz2 = obterNumero("Digite o número de colunas da segunda matriz:");

		        int[][] matriz2 = obterMatriz("Digite os elementos da segunda matriz:", linhasMatriz2, colunasMatriz2);

		        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

		        exibirMatrizResultado(resultado);
		    }

		    private static int obterNumero(String mensagem) {
		        String inputNumero = JOptionPane.showInputDialog(mensagem);
		        return Integer.parseInt(inputNumero);
		    }

		    private static int[][] obterMatriz(String mensagem, int linhas, int colunas) {
		        JOptionPane.showMessageDialog(null, mensagem);

		        int[][] matriz = new int[linhas][colunas];

		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                String inputElemento = JOptionPane.showInputDialog("Elemento [" + (i + 1) + "][" + (j + 1) + "]:");
		                matriz[i][j] = Integer.parseInt(inputElemento);
		            }
		        }

		        return matriz;
		    }

		    private static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
		        int linhasMatriz1 = matriz1.length;
		        int colunasMatriz1 = matriz1[0].length;
		        int colunasMatriz2 = matriz2[0].length;

		        int[][] resultado = new int[linhasMatriz1][colunasMatriz2];

		        for (int i = 0; i < linhasMatriz1; i++) {
		            for (int j = 0; j < colunasMatriz2; j++) {
		                for (int k = 0; k < colunasMatriz1; k++) {
		                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
		                }
		            }
		        }

		        return resultado;
		    }

		    private static void exibirMatrizResultado(int[][] resultado) {
		        StringBuilder mensagem = new StringBuilder("A multiplicação das matrizes é:\n");

		        for (int i = 0; i < resultado.length; i++) {
		            for (int j = 0; j < resultado[0].length; j++) {
		                mensagem.append(resultado[i][j]).append(" ");
		            }
		            mensagem.append("\n");
		        }

		        JOptionPane.showMessageDialog(null, mensagem.toString());
		    }


	}
