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
        scanf.nextLine();

        Lingua linguas[] = new Lingua[qntLinguas];

        for(int i = 0; i < qntLinguas; i++)
        {
            String nome = scanf.nextLine();
            String traducao = scanf.nextLine();

            linguas[i] = new Lingua(nome, traducao);

            //System.out.println(linguas[i].nomeIdioma + " " + linguas[i].traducao);
        }

        int qntPessoas = scanf.nextInt();
        scanf.nextLine();

        for(int i = 0; i < qntPessoas; i++)
        {
            String nome = scanf.nextLine();
            String idioma = scanf.nextLine();

            System.out.println(nome);

            for(int j = 0; j < qntLinguas; j++)
            {
                if(linguas[j].nomeIdioma.equals(idioma))
                {
                    System.out.println(linguas[j].traducao);
                }
            }

            System.out.println();
            
        }

        scanf.close();
    }
}
