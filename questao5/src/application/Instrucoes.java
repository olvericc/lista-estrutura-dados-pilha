package application;

import java.util.Stack;

public class Instrucoes
{
    private Stack<String> instrucoesTarefa;

    public Instrucoes()
    {
        this.instrucoesTarefa = new Stack<>();
    }

    public void inicializar()
    {
        this.instrucoesTarefa = new Stack<>();
    }

    public void criarNovaTarefa(String passo)
    {
        this.instrucoesTarefa.push(passo);

        System.out.println("Passo adicionado: " + passo);
    }

    public String removerTarefaExistente()
    {
        if (this.instrucoesTarefa.isEmpty())
        {
            return "Pilha vazia.";
        }

        return this.instrucoesTarefa.pop();
    }

    public boolean tarefaFoiConcluida()
    {
        return this.instrucoesTarefa.isEmpty();
    }
}
