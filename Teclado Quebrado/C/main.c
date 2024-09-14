#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

void inserirInicio(char frase, char beiju, int *inicio, int *fim)
{

}


int main()
{
    char frase[100000];
    
    while(scanf(" %100000[^\n]", frase) != EOF)
    {
        int tam = strlen(frase);

        char beiju[300000];

        int inicio = 100000;
        int fim = 100000;

        int contador = 0;
        bool ver;

        for(int i = 0; i < tam; i++)
        {
            if(frase[i])
            {
                ver = true;
            }
            else if(frase[i])
            {
                ver = false;
            }

            if(ver) inserirInicio(frase[i], beiju, &inicio, &fim);
            else inserirFim(frase[i], beiju, &inicio, &fim);
        }

        

    }
}
