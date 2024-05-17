package application;

public class UmaPilha
{
    private String conteudoDaPilha = "";

    public void push(char c)
    {
        conteudoDaPilha += c;
    }

    public char pop()
    {
        return conteudoDaPilha.charAt(conteudoDaPilha.length() - 1);
    }

    public boolean estaVazia()
    {
        return conteudoDaPilha.isEmpty();
    }
}
