/*
 Exercício 2: Conversor de Unidades de Temperatura

Crie um programa que permita ao usuário converter uma temperatura de graus Celsius para graus Fahrenheit ou vice-versa. O programa deve perguntar ao usuário qual tipo de conversão deseja realizar, solicitar a temperatura e, em seguida, mostrar o resultado. Use as fórmulas de conversão apropriadas.

Exemplo de saída:

Escolha o tipo de conversão:
1. Celsius para Fahrenheit
2. Fahrenheit para Celsius
Opção: 1

Digite a temperatura em graus Celsius: 25
Resultado em graus Fahrenheit: 77.0

 */

package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex2 {
	
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

	public static void main(String[] args) {
		 String escolha = JOptionPane.showInputDialog("Escolha o tipo de conversão:\n" +
	                "1. Celsius para Fahrenheit\n" +
	                "2. Fahrenheit para Celsius\n" +
	                "Opção:");
	        int opcao = Integer.parseInt(escolha);

	        String inputTemperatura = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
	        double temperatura = Double.parseDouble(inputTemperatura);
	        double resultado;
	        String unidadeSaida;

	        if (opcao == 1) {
	            resultado = celsiusParaFahrenheit(temperatura);
	            unidadeSaida = "Fahrenheit";
	        } else {
	            resultado = fahrenheitParaCelsius(temperatura);
	            unidadeSaida = "Celsius";
	        }

	        String mensagem = String.format("Resultado em graus %s: %.2f", unidadeSaida, resultado);
	        JOptionPane.showMessageDialog(null, mensagem);
	    }
	}

