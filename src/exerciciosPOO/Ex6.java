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
