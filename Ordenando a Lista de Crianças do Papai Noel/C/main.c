#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

struct Crianca
{
    char nome[20];

} typedef Crianca;

int main()
{
    int comportou = 0;
    int naoComportou = 0;

    int repeticoes;
    scanf("%d", &repeticoes);
    getchar();

    Crianca criancas[repeticoes];

    for (int i = 0; i < repeticoes; i++)
    {
        char comportamento = getchar();

        if (comportamento == '+')
        {
            comportou++;
        }
        else
        {
            naoComportou++;
        }

        getchar();
        scanf(" %s", criancas[i].nome);
        getchar();
    }


    // BUBBLE Sort
    for (int i = 0; i < repeticoes - 1; i++)
    {
        bool swapped = false;
        for (int j = 0; j < repeticoes - 1 - i; j++)
        {
            if (strcmp(criancas[j].nome, criancas[j + 1].nome) > 0)
            {
                Crianca temp = criancas[j];
                criancas[j] = criancas[j + 1];
                criancas[j + 1] = temp;

                swapped = true;
            }
        }
        if (!swapped)
        {
            i = repeticoes;
        }
    }

    for(int i = 0; i < repeticoes; i++) printf("%s\n", criancas[i].nome);
    
    printf("Se comportaram: %d | Nao se comportaram: %d\n", comportou, naoComportou);

    return 0;
}