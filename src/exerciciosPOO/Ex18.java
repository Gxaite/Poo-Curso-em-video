package exerciciosPOO;
import javax.swing.JOptionPane;
public class Ex18 {

	public static void main(String[] args) {
		int linhas = obterNumero("Digite o número de linhas:");
        int colunas = obterNumero("Digite o número de colunas:");

        int[][] matriz = obterMatriz("Digite os elementos da matriz:", linhas, colunas);

        int[][] matrizTransposta = calcularTransposta(matriz);

        exibirMatrizTransposta(matrizTransposta);
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

    private static int[][] calcularTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    private static void exibirMatrizTransposta(int[][] matrizTransposta) {
        StringBuilder mensagem = new StringBuilder("A matriz transposta é:\n");

        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[0].length; j++) {
                mensagem.append(matrizTransposta[i][j]).append(" ");
            }
            mensagem.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}

