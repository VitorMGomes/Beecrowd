import java.util.*;

public class OrdNative {

    public static void main(String args[])
    {
        Scanner scanf = new Scanner(System.in);
        int exec = scanf.nextInt();
        scanf.nextLine();

        for(int z = 0; z < exec; z++)
        {
            String input = scanf.nextLine();

            String[] splitted = input.split(" ");

            Arrays.sort(splitted, (a, b) -> Integer.compare(b.length(), a.length()));

            for(int i = 0; i < splitted.length; i++)
            {
                System.out.print(splitted[i]);
                
                if(i < splitted.length - 1)
                {
                    System.out.print(" ");
                }
            }

            if(z < exec - 1)System.out.println();


        }
        scanf.close();
    }
}
