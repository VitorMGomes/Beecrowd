/*
Descrição
Alguém deixou o quadro de medalhas das olimpíadas fora de ordem. Seu programa deve colocá-lo na ordem correta. A ordem dos países no quadro de medalhas é dada pelo número de medalhas de ouro. Se há empate em medalhas de ouro, a nação que tiver mais medalhas de prata fica a frente. Havendo empate em medalhas de ouro e prata, fica mais bem colocado o país com mais medalhas de bronze. Se dois ou mais países empatarem nos três tipos de medalhas, seu programa deve mostrá-los em ordem alfabética.
Entrada
A entrada é dada pelo número de países participantes N (0 ≤ N ≤ 500) seguido pela lista dos países, com suas medalhas de ouro O (0 ≤ 0 ≤ 10000), prata P (0 ≤ P ≤ 10000) e bronze B (0
≤ B ≤ 10000).
Saída
A saída deve ser a lista de países, com suas medalhas de ouro, prata e bronze, na ordem correta do quadro de medalhas, com as nações mais premiadas aparecendo primeiro.
*/
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

struct Pais
{
    char nome[20];
    int ouros;
    int pratas;
    int bronzes;

}typedef Pais;

int compare(Pais a, Pais b)
{
    int aux;

    aux = a.ouros - b.ouros;

    if(aux == 0)
    {
        aux = a.pratas - b.pratas;
    }

    if(aux == 0)
    {
        aux = a.bronzes - b.bronzes;
    }

    return aux;
}


int main()
{
    int rep;
    scanf("%d", &rep);

    Pais paises[rep];

    for(int i = 0; i < rep; i++)
    {
        scanf(" %s %d %d %d", paises[i].nome, &paises[i].ouros, &paises[i].pratas, &paises[i].bronzes);
    }

    //bubble sort

    for(int i = 0; i < rep - 1; i++)
    {
        for(int j = 0; j < rep - 1 - i; j++)
        {
            if(compare(paises[j], paises[j+1]) < 0)
            {
                Pais temp = paises[j];
                paises[j] = paises[j+1];
                paises[j + 1] = temp;
            }
        }
    }

    for(int i = 0; i < rep; i++)
    {
        printf("%s %d %d %d\n", paises[i].nome, paises[i].ouros, paises[i].pratas, paises[i].bronzes);
    }

}