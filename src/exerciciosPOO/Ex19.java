/*
 * Exercício 18: Troca de Valores entre Objetos

Crie uma classe chamada Ponto com os atributos x e y. Em seguida, crie um método na classe principal que aceita dois objetos do tipo Ponto como parâmetros e troca seus valores.
 Demonstre o funcionamento do método no programa principal.
 */
package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {
		Ponto pontoA = criarPonto("Ponto A");
        Ponto pontoB = criarPonto("Ponto B");
        
        exibirValores("Valores iniciais", pontoA, pontoB);


        pontoA.trocarValores(pontoB);

        exibirValores("Valores após a troca", pontoA, pontoB);
    }

    private static Ponto criarPonto(String nomePonto) {
        int x = obterNumero("Digite o valor de x para o " + nomePonto);
        int y = obterNumero("Digite o valor de y para o " + nomePonto);
        return new Ponto(x, y);
    }

    private static int obterNumero(String mensagem) {
        String inputNumero = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(inputNumero);
    }

    private static void exibirValores(String titulo, Ponto ponto1, Ponto ponto2) {
        StringBuilder mensagem = new StringBuilder(titulo + ":\n");
        mensagem.append("Ponto 1: (" + ponto1.x + ", " + ponto1.y + ")\n");
        mensagem.append("Ponto 2: (" + ponto2.x + ", " + ponto2.y + ")\n");

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
    
}