/*
 * Exercício 12: Soma de Vetores

Crie um programa que realiza a soma de dois vetores de inteiros. Os vetores devem ter o mesmo tamanho e serem fornecidos pelo usuário. O programa deve calcular a soma elemento a elemento e exibir o vetor resultante.

Exemplo:

Digite o tamanho dos vetores: 4
Digite os elementos do primeiro vetor:
1
3
5
7
Digite os elementos do segundo vetor:
2
4
6
8
A soma dos vetores é: [3, 7, 11, 15]

 */
package exerciciosPOO;
import javax.swing.JOptionPane;

public class Ex13 {
	 
public static void main(String[] args) {
    int tamanho = obterTamanhoVetores();

    int[] vetor1 = obterVetor("Digite os elementos do primeiro vetor:", tamanho);
    int[] vetor2 = obterVetor("Digite os elementos do segundo vetor:", tamanho);


    int[] resultado = somarVetores(vetor1, vetor2);


    exibirVetorResultado(resultado);
}

private static int obterTamanhoVetores() {
    String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho dos vetores:");
    return Integer.parseInt(inputTamanho);
}

private static int[] obterVetor(String mensagem, int tamanho) {
    int[] vetor = new int[tamanho];

    JOptionPane.showMessageDialog(null, mensagem);

    for (int i = 0; i < tamanho; i++) {
        String inputElemento = JOptionPane.showInputDialog("Elemento " + (i + 1) + ":");
        vetor[i] = Integer.parseInt(inputElemento);
    }

    return vetor;
}

private static int[] somarVetores(int[] vetor1, int[] vetor2) {
    int tamanho = vetor1.length;
    int[] resultado = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
        resultado[i] = vetor1[i] + vetor2[i];
    }

    return resultado;
}

private static void exibirVetorResultado(int[] resultado) {
    StringBuilder mensagem = new StringBuilder("A soma dos vetores é: [");

    for (int i = 0; i < resultado.length; i++) {
        mensagem.append(resultado[i]);

        if (i < resultado.length - 1) {
            mensagem.append(", ");
        }
    }

    mensagem.append("]");

    JOptionPane.showMessageDialog(null, mensagem.toString());
	}
}
