#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int contarRepLetra(char frase[], char letra, int tam)
{
    int contador = 0;

    for(int i = 0; i < tam; i++)
    {
        if(frase[i] == letra)
        {
            contador++;
        }
    }

    return contador;
}

int main()
{

    char letrasAlien[100];
    char frase[200];


    while(scanf(" %100[^\n]", letrasAlien) != EOF)
    {
        scanf(" %200[^\n]", frase);

        int tamLetras = strlen(letrasAlien);
        int contador = 0;

        for(int i = 0; i < tamLetras; i++)
        {
            contador += contarRepLetra(frase, letrasAlien[i], strlen(frase));
        }

        printf("%d\n", contador);

    }

}