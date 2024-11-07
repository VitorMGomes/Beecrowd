
//Start code
import java.util.*;

class teste {
    int t; // chegada
    int c; // execução

    public teste(int t, int c) {
        this.t = t;
        this.c = c;
    }// end contrutor
}// end teste
 // Classe comparadora

class comparador implements Comparator<teste> {
    public int compare(teste p1, teste p2) {
        return Integer.compare(p1.c, p2.c);
    }
}

public class prova {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<teste> testes = new ArrayList<>(); // array list de testes
        PriorityQueue<teste> fila = new PriorityQueue<>(new comparador()); // fila de prioridade
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            testes.clear();
            int demora = 0;
            int tempoExec = 0;
            for (int i = 0; i < n; i++) {
                int t = scan.nextInt();
                int c = scan.nextInt();
                teste p = new teste(t, c);
                if (i == 0 || t < tempoExec) {
                    tempoExec = t;
                } // end if
                testes.add(p);
            } // end for
              // ordena os testes por tempo de chegada
            testes.sort(Comparator.comparingLong(p -> p.t));
            for (teste p : testes) {
                if (p.t > tempoExec) {
                    teste q = fila.poll();
                    if (q != null) {
                        if (q.t <= tempoExec) {
                            demora += tempoExec - q.t;
                        } // end if
                        else {
                            tempoExec = q.t;
                        } // end else
                        tempoExec += q.c;
                    } // end if
                } // end if
                fila.add(p);
            } // end for
            while (!fila.isEmpty()) {
                teste q = fila.poll();
                if (q.t <= tempoExec) {
                    demora += tempoExec - q.t;
                } // end if
                else {
                    tempoExec = q.t;
                } // end else
                tempoExec += q.c;
            } // end while
            System.out.println(demora);
        } // end while
        scan.close();
    }
}// end prova