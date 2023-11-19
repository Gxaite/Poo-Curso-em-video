/* Exercício 3: Lista de Tarefas

Crie um programa que funcione como uma lista de tarefas. O programa deve permitir ao usuário adicionar tarefas, listar as tarefas existentes e marcar tarefas como concluídas. O usuário deve poder interagir com o programa através de comandos, como "adicionar", "listar" e "concluir". Certifique-se de fornecer feedback claro e uma interface amigável para o usuário.

Exemplo de saída:

Comandos disponíveis:
- "adicionar" para adicionar uma nova tarefa
- "listar" para listar as tarefas
- "concluir" para marcar uma tarefa como concluída
- "sair" para sair do programa

Digite um comando: adicionar
Digite a descrição da tarefa: Comprar leite

Tarefa adicionada com sucesso!

Digite um comando: listar
Tarefas pendentes:
1. Comprar leite

Digite um comando: concluir
Digite o número da tarefa a ser concluída: 1

Tarefa "Comprar leite" marcada como concluída.

Digite um comando: listar
Tarefas pendentes:
(Nenhuma tarefa pendente)

Digite um comando: sair
 */

package exerciciosPOO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            String comando = JOptionPane.showInputDialog(getMenu());

            if (comando == null || comando.equalsIgnoreCase("sair")) {
                JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
                System.exit(0);
            }

            switch (comando.toLowerCase()) {
                case "adicionar":
                    String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
                    adicionarTarefa(tarefas, descricao);
                    JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
                    break;
                case "listar":
                    listarTarefas(tarefas);
                    break;
                case "concluir":
                    String numeroTarefaStr = JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída:");
                    try {
                        int numeroTarefa = Integer.parseInt(numeroTarefaStr);
                        concluirTarefa(tarefas, numeroTarefa);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Número de tarefa inválido. Tente novamente.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido. Tente novamente.");
            }

	}

}
	private static void adicionarTarefa(ArrayList<String> tarefas, String descricao) {
        tarefas.add(descricao);
    }

    private static void listarTarefas(ArrayList<String> tarefas) {
        StringBuilder mensagem = new StringBuilder("Tarefas pendentes:\n");
        if (tarefas.isEmpty()) {
            mensagem.append("(Nenhuma tarefa pendente)");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                mensagem.append((i + 1)).append(". ").append(tarefas.get(i)).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    private static void concluirTarefa(ArrayList<String> tarefas, int numeroTarefa) {
        if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
            String tarefaConcluida = tarefas.remove(numeroTarefa - 1);
            JOptionPane.showMessageDialog(null, "Tarefa \"" + tarefaConcluida + "\" marcada como concluída.");
        } else {
            JOptionPane.showMessageDialog(null, "Número de tarefa inválido. Tente novamente.");
        }
    }

    private static String getMenu() {
        return "Comandos disponíveis:\n" +
                "- \"adicionar\" para adicionar uma nova tarefa\n" +
                "- \"listar\" para listar as tarefas\n" +
                "- \"concluir\" para marcar uma tarefa como concluída\n" +
                "- \"sair\" para sair do programa";
    }
}