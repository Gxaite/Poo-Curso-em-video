/*
 * Exercício 19: Cópia de Objetos com Referência

Crie uma classe Aluno com os atributos nome e nota. Em seguida, crie um método na classe principal que aceita um objeto do tipo Aluno como parâmetro e cria uma cópia desse objeto.
 Modifique a cópia e demonstre que a modificação não afeta o objeto original.
 */
package exerciciosPOO;

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		Aluno alunoOriginal = criarAluno("Aluno Original");

        exibirValores("Valores iniciais", alunoOriginal);

        Aluno alunoCopia = alunoOriginal.criarCopia();

        exibirValores("Valores após a criação da cópia", alunoOriginal);

        exibirValores("Valores da cópia", alunoCopia);
    }

    private static Aluno criarAluno(String nomeAluno) {
        String nome = JOptionPane.showInputDialog("Digite o nome do " + nomeAluno);
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + nomeAluno));
        return new Aluno(nome, nota);
    }

    private static void exibirValores(String titulo, Aluno... alunos) {
        StringBuilder mensagem = new StringBuilder(titulo + ":\n");

        for (Aluno aluno : alunos) {
            mensagem.append("Aluno: Nome: ").append(aluno.nome).append(", Nota: ").append(aluno.nota).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

}
