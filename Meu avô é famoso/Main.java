import java.util.*;

class Jogador
{
    public int id;
    public int repeticoes;

    public Jogador(int id) {
        this.id = id;
        this.repeticoes = 0;
    }

    public void addRep()
    {
        this.repeticoes++;
    }

    public void printJogador()
    {
        System.out.println("Jogador: " + this.id + " | " + this.repeticoes);
    }
}

class Lista
{
    public int n;
    public Jogador[] array;

    public Lista(int tamMax)
    {
        this.n = 0;
        this.array = new Jogador[tamMax];
    }

    public void adicionar(int id)
    {
        boolean is = false;

        for(int i = 0; i < n; i++)
        {
            if(id == array[i].id)
            {
                array[i].addRep();
                is = true;
                i = n;
            }
        }

        if(is == false)
        {
            array[n] = new Jogador(id);
            n++; 
        }
    }


    public void printList()
    {
        for(int i = 0; i < n; i++)
        {
            array[i].printJogador();
        }
    }

}

public class Main
{
    public static void main(String args[])
    {
        Scanner scanf = new Scanner(System.in);

        int semanas;
        int jogadores;

        semanas = scanf.nextInt();
        jogadores = scanf.nextInt();

        
        while(semanas == 0 && jogadores == 0){
            
            int qtd = semanas * jogadores;
            Lista list = new Lista(qtd);

            for(int i = 0; i < qtd; i++)
            {
                int temp = scanf.nextInt();
                list.adicionar(temp);
            }


            list.printList();

            semanas = scanf.nextInt();
            jogadores = scanf.nextInt();
        }



        scanf.close();
    }
}