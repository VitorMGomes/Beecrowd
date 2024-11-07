#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

struct Caso
{
    int inicio;
    int tempo;
} typedef Caso;

int main()
{
    int qtdCasos;
    while (scanf("%d", &qtdCasos) != EOF)
    {
        Caso casos[qtdCasos];

        for (int i = 0; i < qtdCasos; i++)
        {
            scanf("%d", &casos[i].inicio);
            scanf("%d", &casos[i].tempo);
        }

        if (qtdCasos == 1)
        {
            printf("0");
        }
        else
        {

            int tempoFila = 0; // tempo total de fila
            for (int i = 0; i < qtdCasos - 1; i++)
            {
                tempoFila += casos[i + 1].inicio - casos[i].inicio;
            }

            int somaExecucoes = 0;
            for (int i = 0; i < qtdCasos; i++)
            {
                somaExecucoes += casos[i].tempo;
            }

            int resp = somaExecucoes - tempoFila + 1;

            printf("%d\n", resp);
        }
    }
}