import java.util.LinkedList;
import java.util.Queue;

public class AgenciaBancaria {

    public static void main(String[] args) {
        Queue<Integer> filaGeral = new LinkedList<>();
        Queue<Integer> filaPrioridade = new LinkedList<>();

        // Adicionar senhas à fila geral
        for (int i = 1; i <= 200; i++) {
            filaGeral.offer(i);

            // Verificar se a senha é ímpar e até 100 para adicionar à fila de prioridade
            if (i % 2 != 0 && i <= 100) {
                filaPrioridade.offer(i);
            }
        }

        // Simulação do atendimento
        while (!filaGeral.isEmpty()) {
            int senhaAtual = filaGeral.poll();

            if (filaPrioridade.contains(senhaAtual)) {
                System.out.println("Atendendo senha de prioridade: " + senhaAtual);
                filaPrioridade.remove(senhaAtual);
            } else {
                System.out.println("Atendendo senha: " + senhaAtual);
            }
        }
    }
}