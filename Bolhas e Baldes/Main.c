#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main()
{
    int tam;
    scanf("%d", &tam);

    while (tam != 0)
    {
        int array[tam];

        for (int i = 0; i < tam; i++)
        {
            scanf("%d", &array[i]);
        }

        int controlador = 1;

        for (int i = 0; i < tam - 1; i++)
        {
            for (int j = 0; j < tam - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    controlador *= (-1);
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        if (controlador == -1)
        {
            printf("Carlos\n");
        }
        else
        {
            printf("Marcelo\n");
        }

        scanf("%d", &tam);
    }
}