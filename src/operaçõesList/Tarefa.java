package operaçõesList;

public class Tarefa implements Comparable<Tarefa> {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    @Override
    public int compareTo(Tarefa outraTarefa) {
        return this.descricao.compareTo(outraTarefa.descricao);
    }

    @Override
    public String toString() {
        return  descricao;
    }
}
