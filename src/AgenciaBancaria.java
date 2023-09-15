import java.util.LinkedList;
import java.util.Queue;

public class AgenciaBancaria {

    public static void main(String[] args) {
        Queue<Integer> filaGeral = new LinkedList<>();
        Queue<Integer> filaPrioridade = new LinkedList<>();

        for (int i = 1; i <= 200; i++) {
            filaGeral.offer(i);

            if (i % 2 != 0 && i <= 100) {
                filaPrioridade.offer(i);
            }
        }
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