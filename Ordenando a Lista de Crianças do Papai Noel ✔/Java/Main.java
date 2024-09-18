import java.util.*;

class Crianca
{
    String nome;

    Crianca(String nome)
    {
        this.nome = nome;
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner scanf = new Scanner(System.in);

        int qntCriancas = scanf.nextInt();
        scanf.nextLine();

        Crianca criancas[] = new Crianca[qntCriancas];
        int comportou = 0;
        int naoComportou = 0;

        for(int i = 0; i < qntCriancas; i++)
        {
            String input = scanf.nextLine();

            String[] splitted = input.split(" ");
            
            if(splitted[0].equals("+"))
            {
                comportou++;
            }
            else{
                naoComportou++;
            }
            
            criancas[i] = new Crianca(splitted[1]);
        }

        //bubble sort

        for(int i = 0; i < qntCriancas - 1; i++)
        {
            for(int j = 0; j < qntCriancas - 1 - i; j++)
            {
                if(criancas[j].nome.compareTo(criancas[j+1].nome) > 0)
                {
                    Crianca temp = criancas[j];
                    criancas[j] = criancas[j+1];
                    criancas[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < qntCriancas; i++)
        {
            System.out.println(criancas[i].nome);
        }
        System.out.println("Se comportaram: " + comportou + "| Nao se comportaram: " + naoComportou);

        scanf.close();
    }
}