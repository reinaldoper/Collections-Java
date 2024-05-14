package operaçõesList;

public class MostrarTarefasSetStream {
    public MostrarTarefasSetStream() {
    }

    public void listTarefas(){
        ListaTarefaSet listaTarefaSet = new ListaTarefaSet();
        listaTarefaSet.adicionarTarefa("Tarefa set 1");
        listaTarefaSet.adicionarTarefa("Tarefa set 2");
        listaTarefaSet.adicionarTarefa("Tarefa set 23");
        listaTarefaSet.adicionarTarefa("Tarefa set 12");

        listaTarefaSet.removerTarefa("Tarefa set 1");
        listaTarefaSet.ordenarTarefas();
        listaTarefaSet.obterDescricaoTarefa();
        System.out.println("--------------------");
        ListaTarefaStream listaTarefaStream = new ListaTarefaStream();
        listaTarefaStream.adicionarTarefa("Tarefa scream 1");
        listaTarefaStream.adicionarTarefa("Tarefa scream 11");
        listaTarefaStream.adicionarTarefa("Tarefa scream 21");
        listaTarefaStream.adicionarTarefa("Tarefa scream 2");

        listaTarefaStream.removerTarefa("Tarefa scream 11");
        listaTarefaStream.ordenarTarefas();
        listaTarefaStream.obterDescricaoTarefa();
    }
}
