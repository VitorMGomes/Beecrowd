import java.util.*;


public class Main {
    
    static int contandoRepetidos(char letra, String frase)
    {
        int tam = frase.length();
        int contador = 0;


        for(int i = 0; i < tam; i++)
        {
            if(letra == frase.charAt(i)) contador++;
        }

        return contador;
    }
    
    
    
    
    public static void main(String args[])
    {
        
        Scanner scanf = new Scanner(System.in);

        while(scanf.hasNext())
        {
            String letrasAlien = scanf.nextLine();

            String frase = scanf.nextLine();

            int contador = 0;

            for(int i = 0; i < letrasAlien.length(); i++)
            {
                contador += contandoRepetidos(letrasAlien.charAt(i), frase);
            }

            System.out.println(contador);
        }


        scanf.close();
        
    }
}
