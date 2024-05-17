package application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Verificar se é um palíndromo: ");

        String palavra = sc.nextLine().toLowerCase();

        StringBuilder limpo = new StringBuilder();

        for (char c : palavra.toCharArray())
        {
            if (Character.isLetterOrDigit(c))
            {
                limpo.append(c);
            }
        }

        String inversoDaPalavra = limpo.reverse().toString();

        if (limpo.toString().equals(inversoDaPalavra))
        {
            System.out.println("É um palíndromo.");
        }
        else
        {
            System.out.println("Não é um palíndromo.");
        }
    }
}
