package operaçõesList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaTarefaSet {
    private Set<Tarefa> tarefaSet;

    public ListaTarefaSet() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefaRemover = tarefa;
                break;
            }
        }
        if (tarefaRemover != null) {
            tarefaSet.remove(tarefaRemover);
        }
    }

    public void ordenarTarefas() {
        Set<Tarefa> tarefasOrdenadas = new TreeSet<>(tarefaSet);
        tarefaSet.clear();
        tarefaSet.addAll(tarefasOrdenadas);
        for (Tarefa tarefa : tarefaSet) {
            System.out.println(tarefa.getDescricao());
        }
    }
}
