import java.util.*;

class Lingua
{
    String nomeIdioma;
    String traducao;


    Lingua(String idioma, String traducao)
    {
        this.nomeIdioma = idioma;
        this.traducao = traducao;
    }

}


public class Main {
    
    public static void main(String args[])
    {

        Scanner scanf = new Scanner(System.in);
        int qntLinguas = scanf.nextInt();

        Lingua linguas[] = new Lingua[qntLinguas];

        for(int i = 0; i < qntLinguas; i++)
        {
            String nome = scanf.nextLine();
            String traducao = scanf.nextLine();

            linguas[i] = new Lingua(nome, traducao);
        }

        for(int i = 0; i <)


    }
}
