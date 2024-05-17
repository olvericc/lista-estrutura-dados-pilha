package application;

import java.util.Vector;

public class Livros
{
    private final Vector<String> vLivros = new Vector<>();

    public void inserirNaPilha(String livro)
    {
        vLivros.add(livro);
        System.out.println("Livro " + livro + " adicionado ao vetor.");
    }

    public String consultarNaPilha()
    {
        if (vLivros.isEmpty())
        {
            return "Está vazio.";
        }

        return vLivros.lastElement();
    }

    public String removerDaPilha()
    {
        if (vLivros.isEmpty())
        {
            return "O vetor está vazio.";
        }
        return vLivros.removeLast();
    }

    public void esvaziarVetor()
    {
        while (!vLivros.isEmpty())
        {
            vLivros.removeLast();
        }
        System.out.println("O vetor foi esvaziado.");
    }

    public void sair()
    {
        System.exit(0);
    }
}
