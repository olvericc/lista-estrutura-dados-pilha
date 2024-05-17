package application;

public class Main
{
    public static void main(String[] args)
    {
        Livros livros = new Livros();

        livros.inserirNaPilha("Harry Potter 1");
        livros.inserirNaPilha("Harry Potter 2");
        livros.inserirNaPilha("Harry Potter 1");

        System.out.println("Último livro adicionado: " + livros.consultarNaPilha());

        String livroRemovido = livros.removerDaPilha();

        System.out.println("Último livro removido: " + livroRemovido);

        livros.esvaziarVetor();

        livros.sair();
    }
}
