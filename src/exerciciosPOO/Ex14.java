package exerciciosPOO;
import javax.swing.JOptionPane;

public class Ex14 {

	    public static void main(String[] args) {
	     
	        int tamanho = obterTamanhoVetores();

	        double[] vetor1 = obterVetor("Digite os elementos do primeiro vetor:", tamanho);
	        double[] vetor2 = obterVetor("Digite os elementos do segundo vetor:", tamanho);

	        double produtoEscalar = calcularProdutoEscalar(vetor1, vetor2);

	        exibirResultado(produtoEscalar);
	    }

	    private static int obterTamanhoVetores() {
	        String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho dos vetores:");
	        return Integer.parseInt(inputTamanho);
	    }

	    private static double[] obterVetor(String mensagem, int tamanho) {
	        double[] vetor = new double[tamanho];

	        JOptionPane.showMessageDialog(null, mensagem);

	        for (int i = 0; i < tamanho; i++) {
	            String inputElemento = JOptionPane.showInputDialog("Elemento " + (i + 1) + ":");
	            vetor[i] = Double.parseDouble(inputElemento);
	        }

	        return vetor;
	    }

	    private static double calcularProdutoEscalar(double[] vetor1, double[] vetor2) {
	        int tamanho = vetor1.length;
	        double produtoEscalar = 0;

	        for (int i = 0; i < tamanho; i++) {
	            produtoEscalar += vetor1[i] * vetor2[i];
	        }

	        return produtoEscalar;
	    }

	    private static void exibirResultado(double produtoEscalar) {
	        JOptionPane.showMessageDialog(null, String.format("O produto escalar dos vetores é: %.1f", produtoEscalar));
	    }
	}


