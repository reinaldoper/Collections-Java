package operaçõesList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removerTarefa = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equals(descricao)){
                removerTarefa.add(t);
            }
        }
        tarefaList.removeAll(removerTarefa);
    }

    public int obterTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public List<Tarefa> filtrarTarefa(String descricao) {
        List<Tarefa> tarefasFiltradas = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasFiltradas.add(t);
            }
        }
        return tarefasFiltradas;
    }

    public void orderTarefas() {
        Collections.sort(tarefaList);
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
    }

}
