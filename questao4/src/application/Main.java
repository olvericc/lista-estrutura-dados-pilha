package application;

public class Main
{
    public static void main(String[] args)
    {
        PaginaWeb pagina = new PaginaWeb();

        pagina.push("https://intranet-dev.salvador.ba.gov.br/");
        pagina.push("https://intranet-homologa.salvador.ba.gov.br/");
        pagina.push("https://intranet.salvador.ba.gov.br/");

        System.out.println("URL removida: " + pagina.pop());
        System.out.println("URL removida: " + pagina.pop());
    }
}
