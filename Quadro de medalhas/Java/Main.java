import java.util.*;

class Pais {
    String nome;
    int ouros = 0;
    int pratas = 0;
    int bronzes = 0;

    Pais(String nome, int ouros, int pratas, int bronzes) {
        this.nome = nome;
        this.ouros = ouros;
        this.pratas = pratas;
        this.bronzes = bronzes;

    }

    void mostrar() {
        System.out.println(this.nome + " " + this.ouros + " " + this.pratas + " " + this.bronzes);
    }
}

public class Main {
    public static void main(String args[]) {

        Scanner scanf = new Scanner(System.in);

        int repeticoes = scanf.nextInt();
        scanf.nextLine();

        Pais paises[] = new Pais[repeticoes];

        for (int i = 0; i < repeticoes; i++) {

            String nome = scanf.next();
            int ouros = scanf.nextInt();
            int pratas = scanf.nextInt();
            int bronzes = scanf.nextInt();

            paises[i] = new Pais(nome, ouros, pratas, bronzes);
        }

        // bubble sort
        for (int i = 0; i < repeticoes - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < repeticoes - 1 - i; j++) {
                boolean swappar = false;

                if (paises[j].ouros < paises[j + 1].ouros)
                    swappar = true;

                else if ((paises[j].ouros == paises[j + 1].ouros) && (paises[j].pratas < paises[j + 1].pratas))
                    swappar = true;

                else if ((paises[j].pratas == paises[j + 1].pratas) && (paises[j].bronzes < paises[j + 1].bronzes))
                    swappar = true;

                if (swappar) {
                    Pais temp = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                i = repeticoes;
            }
        }

        for (int i = 0; i < repeticoes; i++) {
            paises[i].mostrar();
        }

        scanf.close();
    }
}