import java.util.Scanner;

public class FilaAtendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fila filaPrioridade = new Fila();
        Fila filaComum = new Fila();

        int atendimentosPrioridade = 0;

        while (true) {
            System.out.println("\n1 - Solicitar nova senha");
            System.out.println("2 - Excluir uma senha");
            System.out.println("3 - Listar todas as senhas");
            System.out.println("4 - Visualizar o próximo a ser atendido");
            System.out.println("5 - Chamar o próximo paciente");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do paciente: ");
                    String nome = scanner.nextLine();
                    System.out.print("O paciente tem prioridade? (S/N): ");
                    char prioridade = scanner.next().charAt(0);

                    if (prioridade == 'S' || prioridade == 's') {
                        filaPrioridade.enfileirar(nome);
                    } else {
                        filaComum.enfileirar(nome);
                    }
                    System.out.println("Senha gerada para " + nome);
                    break;

                case 2:
                    System.out.print("Digite o nome da senha a excluir: ");
                    String nomeExcluir = scanner.nextLine();

                    if (filaPrioridade.remover(nomeExcluir) || filaComum.remover(nomeExcluir)) {
                        System.out.println("Senha " + nomeExcluir + " removida com sucesso!");
                    } else {
                        System.out.println("Senha não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println("\n=== Senhas Prioritárias ===");
                    filaPrioridade.listarTodos();
                    System.out.println("\n=== Senhas Comuns ===");
                    filaComum.listarTodos();
                    break;

                case 4:
                    if (!filaPrioridade.estaVazia()) {
                        System.out.println("Próximo paciente (Prioridade): " + filaPrioridade.espiar());
                    } else if (!filaComum.estaVazia()) {
                        System.out.println("Próximo paciente (Comum): " + filaComum.espiar());
                    } else {
                        System.out.println("Nenhum paciente na fila.");
                    }
                    break;

                case 5:
                    if (!filaPrioridade.estaVazia() && atendimentosPrioridade < 3) {
                        System.out.println("Atendendo (Prioridade): " + filaPrioridade.desenfileirar());
                        atendimentosPrioridade++;
                    } else if (!filaComum.estaVazia()) {
                        System.out.println("Atendendo (Comum): " + filaComum.desenfileirar());
                        atendimentosPrioridade = 0;
                    } else {
                        System.out.println("Nenhum paciente na fila.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
