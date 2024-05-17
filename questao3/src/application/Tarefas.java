package application;

import java.util.Stack;

public class Tarefas
{
    private final Stack<String> pTarefas = new Stack<>();

    public void inserir(String tarefa)
    {
        pTarefas.push(tarefa);

        System.out.println("A Tarefa " + tarefa + " foi inserida na pilha.");
    }

    public String obterProxima()
    {
        if (pTarefas.isEmpty())
        {
            return "Não há nenhuma tarefas na pilha.";
        }

        return pTarefas.peek();
    }
}
