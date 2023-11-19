/*
 * Exercício 14: Verificação de Palíndromos com Vetores

Crie um programa que verifica se uma palavra fornecida pelo usuário é um palíndromo. Utilize um vetor para armazenar os caracteres da palavra. O programa deve considerar apenas as letras (ignorando espaços, pontuações, etc.) e realizar a verificação.

Exemplo:

Digite uma palavra: radar
A palavra "radar" é um palíndromo.

 */
package exerciciosPOO;
import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		String palavra = obterPalavra();

        boolean ehPalindromo = verificarPalindromo(palavra);

        exibirResultado(palavra, ehPalindromo);
    }

    private static String obterPalavra() {
        return JOptionPane.showInputDialog("Digite uma palavra:");
    }

    private static boolean verificarPalindromo(String palavra) {
        String palavraProcessada = palavra.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] vetorCaracteres = palavraProcessada.toCharArray();

        for (int i = 0, j = vetorCaracteres.length - 1; i < j; i++, j--) {
            if (vetorCaracteres[i] != vetorCaracteres[j]) {
                return false;
            }
        }

        return true;
    }

    private static void exibirResultado(String palavra, boolean ehPalindromo) {
        if (ehPalindromo) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

}
