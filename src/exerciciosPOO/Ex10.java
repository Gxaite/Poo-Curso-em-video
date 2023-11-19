package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
        int numeroInicial = obterNumeroInicial();

        realizarContagemRegressiva(numeroInicial);
    }

    private static int obterNumeroInicial() {
        String inputNumeroInicial = JOptionPane.showInputDialog("Digite um número inicial:");
        return Integer.parseInt(inputNumeroInicial);
    }

    private static void realizarContagemRegressiva(int numeroInicial) {
        int contador = numeroInicial;

        while (contador >= 1) {
            System.out.println(contador);

            contador--;
        }
		
	}

}
