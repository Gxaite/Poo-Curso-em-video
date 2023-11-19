/*
 * Exercício 6: Calculadora de IMC (Índice de Massa Corporal)

Peça ao usuário para inserir seu peso em quilogramas e sua altura em metros. Em seguida, calcule o Índice de Massa Corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura). Exiba o resultado e classifique o usuário de acordo com a tabela de classificação de IMC.

Lembre-se de realizar as conversões de tipos necessárias para garantir que as operações matemáticas sejam feitas corretamente.

Digite seu peso em kg: 70
Digite sua altura em metros: 1.75

Seu IMC é: 22.86
Classificação de IMC: Normal

 */

package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		double peso = obterPeso();
        double altura = obterAltura();

        double imc = calcularIMC(peso, altura);

        String mensagem = String.format("Seu IMC é: %.2f\nClassificação de IMC: %s", imc, classificarIMC(imc));

        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static double obterPeso() {
        String inputPeso = JOptionPane.showInputDialog("Digite seu peso em kg:");
        return Double.parseDouble(inputPeso);
    }

    private static double obterAltura() {
        String inputAltura = JOptionPane.showInputDialog("Digite sua altura em metros:");
        return Double.parseDouble(inputAltura);
    }

    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    private static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

	}
