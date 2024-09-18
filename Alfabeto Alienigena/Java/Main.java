//https://neps.academy/br/exercise/2792

import java.util.*;

public class Main
{

    static boolean presente(char letraMsg, String alfabeto, int alfabetoTAM)
    {

        for(int i = 0; i < alfabetoTAM; i++)
        {
            if(letraMsg == alfabeto.charAt(i))
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String args[])
    {
        Scanner scanf = new Scanner(System.in);

        int alfabetoTAM = scanf.nextInt();
        int mensagemTAM = scanf.nextInt();
        scanf.nextLine();

        String alfabeto = scanf.nextLine();
        String mensagem = scanf.nextLine();

        boolean resp = true;

        for(int i = 0; i < mensagemTAM; i++)
        {
            if(!presente(mensagem.charAt(i), alfabeto, alfabetoTAM))
            {
                resp = false;
                i = mensagemTAM;
            }
        }

        if(resp)
        {
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
        
        scanf.close();
    }
}