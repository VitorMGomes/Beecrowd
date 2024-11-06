import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner scanf = new Scanner(System.in);

        int reps = scanf.nextInt();

        for(int rep = 0; rep < reps; rep++)
        {
            int tam = scanf.nextInt();
            int[] array = new int[tam];
            
            for(int pos = 0; pos < tam; pos++)
            {
                array[pos] = scanf.nextInt();
            }

            int swapped = 0;

            for(int i = 0; i < tam - 1; i++)
            {
                for(int j = 0; j < tam - i - 1; j++)
                {
                    if(array[j] > array[j + 1])
                    {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                        
                        swapped++;
                    }
                }
            }

            System.out.println(swapped);
        }

        scanf.close();


    }
}