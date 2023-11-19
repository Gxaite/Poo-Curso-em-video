
package exerciciosPOO;
import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		double numero1 = obterNumero("Digite o primeiro número:");
        double numero2 = obterNumero("Digite o segundo número:");

        int opcao = obterOpcao();

        double resultado = realizarOperacao(numero1, numero2, opcao);
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

    private static double obterNumero(String mensagem) {
        String inputNumero = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(inputNumero);
    }

    private static int obterOpcao() {
        String inputOpcao = JOptionPane.showInputDialog(
                "Escolha a operação:\n" +
                        "1. Adição\n" +
                        "2. Subtração\n" +
                        "3. Multiplicação\n" +
                        "4. Divisão\n" +
                        "Opção:");
        return Integer.parseInt(inputOpcao);
    }

    private static double realizarOperacao(double num1, double num2, int opcao) {
        switch (opcao) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                    System.exit(0);
                }
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Saindo do programa.");
                System.exit(0);
        }
        return 0;
    }

	}
