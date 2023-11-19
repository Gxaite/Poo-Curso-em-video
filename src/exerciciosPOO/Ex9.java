/*
 * Exercício 9: Classificação de Média Ponderada

Solicite ao usuário para inserir as três notas e seus respectivos pesos. Utilize uma estrutura if-else para atribuir uma classificação com base na seguinte escala:

Média ponderada de 90 a 100: A
Média ponderada de 80 a 89: B
Média ponderada de 70 a 79: C
Média ponderada de 60 a 69: D
Média ponderada abaixo de 60: F

Imprima a classificação correspondente.
Exemplo:

Digite a nota 1: 85
Digite o peso da nota 1: 0.3

Digite a nota 2: 78
Digite o peso da nota 2: 0.4

Digite a nota 3: 92
Digite o peso da nota 3: 0.3

A média ponderada é 86.2, que corresponde à classificação B.

 */
package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex9 {

	    public static void main(String[] args) {
	        // Solicita ao usuário para inserir as três notas e pesos
	        double nota1 = obterNota("Digite a nota 1:");
	        double peso1 = obterPeso("Digite o peso da nota 1:");

	        double nota2 = obterNota("Digite a nota 2:");
	        double peso2 = obterPeso("Digite o peso da nota 2:");

	        double nota3 = obterNota("Digite a nota 3:");
	        double peso3 = obterPeso("Digite o peso da nota 3:");

	        // Calcula a média ponderada
	        double mediaPonderada = calcularMediaPonderada(nota1, peso1, nota2, peso2, nota3, peso3);

	        // Atribui uma classificação com base na escala
	        String classificacao = atribuirClassificacao(mediaPonderada);

	        // Imprime a classificação correspondente
	        JOptionPane.showMessageDialog(null, "A média ponderada é " + mediaPonderada + ", que corresponde à classificação " + classificacao + ".");
	    }

	    private static double obterNota(String mensagem) {
	        String inputNota = JOptionPane.showInputDialog(mensagem);
	        return Double.parseDouble(inputNota.replace(',', '.'));
	    }

	    private static double obterPeso(String mensagem) {
	        String inputPeso = JOptionPane.showInputDialog(mensagem);
	        return Double.parseDouble(inputPeso.replace(',', '.'));
	    }

	    private static double calcularMediaPonderada(double nota1, double peso1, double nota2, double peso2, double nota3, double peso3) {
	        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
	    }

	    private static String atribuirClassificacao(double mediaPonderada) {
	        if (mediaPonderada >= 90 && mediaPonderada <= 100) {
	            return "A";
	        } else if (mediaPonderada >= 80 && mediaPonderada < 90) {
	            return "B";
	        } else if (mediaPonderada >= 70 && mediaPonderada < 80) {
	            return "C";
	        } else if (mediaPonderada >= 60 && mediaPonderada < 70) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }
	}

