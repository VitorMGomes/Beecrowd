import java.util.*;

class Pilha {
    int n;
    int array[];

    Pilha(int tam) {
        this.array = new int[tam];

        n = 0;
    }

    void Pop() {
        if (n == 0) {
            System.out.println("EMPTY");
        } else {
            n--;
        }

    }

    void Push(int x) {
        array[n] = x;
        n++;
    }

    int Min() {
        if (n == 0) {
            System.out.println("EMPTY");
            return -1;
        }

        int min = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner scanf = new Scanner(System.in);

        int rep = scanf.nextInt();
        scanf.nextLine();

        Pilha pilha = new Pilha(rep);

        for (int i = 0; i < rep; i++) {
            String operacao = scanf.next();

            if (operacao.equals("PUSH")) 
            {
                int num = scanf.nextInt();
                scanf.nextLine();

                pilha.Push(num);

            }
            else if (operacao.equals("POP")) 
            {
                pilha.Pop();
            }
            else if (operacao.equals("MIN")) 
            {
                System.out.println(pilha.Min());
            }

        }

        scanf.close();

    }
}