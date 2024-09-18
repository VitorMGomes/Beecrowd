#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int buscarMenor(int pilha[], int tam)
{
    int menor = pilha[0];

    for(int i = 1; i < tam; i++)
    {
        if(pilha[i] < menor)
        {
            menor = pilha[i];
        }
    }

    return menor;
}


int main()
{
    int rep;
    scanf("%d", &rep);
    int pilha[rep];
    int n = 0;

    for(int i = 0; i < rep; i++)
    {

        char comando[4];
        scanf("%s", comando);

        if(strcmp(comando, "PUSH") == 0)
        {
            int num;
            scanf("%d", &pilha[n]);
            n++;
        }
        else if(strcmp(comando, "POP") == 0)
        {
            if(n <= 0)
            {
                printf("EMPTY");
            }
            else
            {
                n--;
            }
        }
        else
        {
            if(n <= 0)
            {
                printf("EMPTY");
            }
            else
            {
                printf("%d\n", buscarMenor(pilha, n));
            }
        }
    }
}