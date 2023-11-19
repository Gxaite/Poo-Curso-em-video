package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		int numeroAleatorio = (int) (Math.random() * 10) + 1;

        int tentativas = 0;
        do {

            int tentativa = obterTentativa();


            tentativas++;
            
            if (tentativa == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
                break;
                
            } else {
                if (tentativa < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor.");
                }
            }

        } while (true);
    }

    private static int obterTentativa() {
        String inputTentativa = JOptionPane.showInputDialog("Adivinhe o número entre 1 e 10.\nTentativa:");
        return Integer.parseInt(inputTentativa);
    }
}


