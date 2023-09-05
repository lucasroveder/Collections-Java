import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //metodos
        //adiciona tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

        //remove tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

        //retorna numero total de itens na lista
    public int obterNumeroTotaTarefas(){
        return tarefaList.size();
    }

        //Obtem a descricao das tarefas
    public void oberDescricoesTarefas(){
        List<String> descricaoTarefas = new ArrayList<>();
        for(Tarefa t : tarefaList){
            descricaoTarefas.add(t.getDescricao());
        }
        for (String d : descricaoTarefas){
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        // testando os metodos
        ListaTarefa listaTarefa = new ListaTarefa();

        //metodo obter numeros
        System.out.println("Numero total de tarefas eh: " + listaTarefa.obterNumeroTotaTarefas());

        //metodo adciona
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Numero total de tarefas eh: " + listaTarefa.obterNumeroTotaTarefas());
        
        //metodo remove
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Numero total de tarefas eh: " + listaTarefa.obterNumeroTotaTarefas());
        
        //metodo obter descricao
        listaTarefa.oberDescricoesTarefas();
    }

}
