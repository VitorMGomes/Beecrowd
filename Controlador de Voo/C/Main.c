#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

struct Aviao
{
    char aviao[10];
} typedef Aviao;

struct Fila
{
    Aviao avioes[100];
    int inicio;
    int tam;

} typedef Fila;

void iniciarFila(Fila *fila)
{
    fila->inicio = 0;
    fila->tam = 0;
}

void inserir(Fila *fila, Aviao aviao)
{
    fila->avioes[fila->tam] = aviao;
    fila->tam++;
}

Aviao remover(Fila *fila)
{
    Aviao resp = fila->avioes[fila->inicio];
    fila->inicio++;

    return resp;
}

void mostrar(Fila *fila)
{
    for(int i = fila->inicio; i < fila->tam; i++)
    {
        printf("%s ", fila->avioes[i].aviao);
    }
}

int main()
{
    Fila norte;
    iniciarFila(&norte);
    Fila sul;
    iniciarFila(&sul);
    Fila oeste;
    iniciarFila(&oeste);
    Fila leste;
    iniciarFila(&leste);

    int set;

    char comando[10];

    scanf("%s", comando);

    while (comando[0] != '0')
    {
        getchar();
        if (comando[0] == '-')
        {
            if (comando[1] == '1')
                set = 1; // oeste
            if (comando[1] == '2')
                set = 2; // sul
            if (comando[1] == '3')
                set = 3; // norte
            if (comando[1] == '4')
                set = 4; // leste
        }
        else
        {
            //printf("%d", set);
            if (set == 1)
            {
                Aviao x;
                strcpy(x.aviao, comando);
                inserir(&oeste,x);
            }
            else if (set == 2)
            {
                Aviao x;
                strcpy(x.aviao, comando);
                inserir(&sul,x);
            }
            else if (set == 3)
            {
                Aviao x;
                strcpy(x.aviao, comando);
                inserir(&norte,x);
            }
            else if (set == 4)
            {
                Aviao x;
                strcpy(x.aviao, comando);
                inserir(&leste,x);
            }
        }

        scanf("%s", comando);
    }

    Fila final;
    iniciarFila(&final);

    while(oeste.inicio != oeste.tam || leste.inicio != leste.tam || sul.inicio != sul.tam || norte.inicio != norte.tam)
    {
        if(oeste.inicio != oeste.tam)
        {
            inserir(&final, remover(&oeste));
        }
        if(norte.inicio != norte.tam)
        {
            inserir(&final, remover(&norte));
        }
        if(sul.inicio != sul.tam)
        {
            inserir(&final, remover(&sul));
        }
        if(leste.inicio != leste.tam)
        {
            inserir(&final, remover(&leste));
        }
        

    }

    mostrar(&final);

}