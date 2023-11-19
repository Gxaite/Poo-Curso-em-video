/*
 * Exercício 4: Calculadora de Média Ponderada

Peça ao usuário para inserir as notas de três disciplinas (cada nota de 0 a 10) e os pesos correspondentes de cada disciplina. Em seguida, calcule e exiba a média ponderada das notas. Certifique-se de que as notas e pesos sejam armazenados como números decimais.

 */

package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex4 {

	
		public static void main(String[] args) {

			double nota1 = obterNota("Digite a nota da disciplina 1:");
	        double peso1 = obterPeso("Digite o peso da disciplina 1:");

	        double nota2 = obterNota("Digite a nota da disciplina 2:");
	        double peso2 = obterPeso("Digite o peso da disciplina 2:");

	        double nota3 = obterNota("Digite a nota da disciplina 3:");
	        double peso3 = obterPeso("Digite o peso da disciplina 3:");

	   
	        double mediaPonderada = calcularMediaPonderada(nota1, peso1, nota2, peso2, nota3, peso3);
	        JOptionPane.showMessageDialog(null, "A média ponderada é: " + mediaPonderada);
	    }

	    private static double obterNota(String mensagem) {
	        String inputNota = JOptionPane.showInputDialog(mensagem);
	        return Double.parseDouble(inputNota);
	    }

	    private static double obterPeso(String mensagem) {
	        String inputPeso = JOptionPane.showInputDialog(mensagem);
	        return Double.parseDouble(inputPeso);
	    }

	    private static double calcularMediaPonderada(double nota1, double peso1, double nota2, double peso2, double nota3, double peso3) {
	        double somaNotas = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
	        double somaPesos = peso1 + peso2 + peso3;
	        return somaNotas / somaPesos;
	    }
	}
