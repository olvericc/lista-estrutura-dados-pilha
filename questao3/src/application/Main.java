package application;

public class Main
{
    public static void main(String[] args)
    {
        Tarefas tarefas = new Tarefas();

        tarefas.inserir("Estudar TAD");
        tarefas.inserir("Estudar Recursividade");
        tarefas.inserir("Estudar Lista Simplesmente Encadeada");
        tarefas.inserir("Estudar Lista Duplamente Encadeada");
        tarefas.inserir("Estudar Pilha");
        tarefas.inserir("Estudar Fila");
        tarefas.inserir("Estudar Árvore");

        System.out.println("A sua próxima tarefa é: " + tarefas.obterProxima());

        tarefas.inserir("Ir para uma festa e não estudar para Estrutura de Dados!");

        System.out.println("Próxima tarefa após execução: " + tarefas.obterProxima());
    }
}
