/*
 * Exercício 15: Soma de Matrizes

Crie um programa que realiza a soma de duas matrizes. As matrizes devem ter o mesmo número de linhas e colunas e serem fornecidas pelo usuário. O programa deve calcular a soma elemento a elemento e exibir a matriz resultante.

Exemplo:

Digite o número de linhas: 2
Digite o número de colunas: 3

Digite os elementos da primeira matriz:
1 2 3
4 5 6

Digite os elementos da segunda matriz:
7 8 9
10 11 12

A soma das matrizes é:
8 10 12
14 16 18

 */
package exerciciosPOO;
import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		        
		        int linhas = obterNumero("Digite o número de linhas:");
		        int colunas = obterNumero("Digite o número de colunas:");
		        int[][] matriz1 = obterMatriz("Digite os elementos da primeira matriz:", linhas, colunas);
		        int[][] matriz2 = obterMatriz("Digite os elementos da segunda matriz:", linhas, colunas);

		        int[][] resultado = somarMatrizes(matriz1, matriz2);

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

		    private static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
		        int linhas = matriz1.length;
		        int colunas = matriz1[0].length;
		        int[][] resultado = new int[linhas][colunas];

		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
		            }
		        }

		        return resultado;
		    }

		    private static void exibirMatrizResultado(int[][] resultado) {
		        StringBuilder mensagem = new StringBuilder("A soma das matrizes é:\n");

		        for (int i = 0; i < resultado.length; i++) {
		            for (int j = 0; j < resultado[0].length; j++) {
		                mensagem.append(resultado[i][j]).append(" ");
		            }
		            mensagem.append("\n");
		        }

		        JOptionPane.showMessageDialog(null, mensagem.toString());
		    }


	}

