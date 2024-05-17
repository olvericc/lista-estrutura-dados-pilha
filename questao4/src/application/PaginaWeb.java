package application;

import java.util.Vector;

public class PaginaWeb
{
    private final Vector<String> paginasVisitadas;

    public PaginaWeb()
    {
        this.paginasVisitadas = new Vector<>();
    }

    public void inicializar()
    {
        this.paginasVisitadas.clear();
    }

    public void push(String url)
    {
        this.paginasVisitadas.add(url);
        System.out.println("A seguinte URL adicionada à pilha: " + url);
    }

    public String pop()
    {
        if (this.paginasVisitadas.isEmpty())
        {
            return "Nossa pilha está vazia";
        }
        return this.paginasVisitadas.removeLast();
    }
}
