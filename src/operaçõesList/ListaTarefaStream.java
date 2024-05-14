package operaçõesList;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefaStream {
    private Set<Tarefa> tarefaSet;

    public ListaTarefaStream() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaSet = tarefaSet.stream()
                .filter(tarefa -> !tarefa.getDescricao().equals(descricao))
                .collect(Collectors.toSet());
    }

    public void ordenarTarefas() {
        tarefaSet = tarefaSet.stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaSet);
    }
}
