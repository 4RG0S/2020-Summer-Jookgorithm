#include <stdio.h>
#include <stdlib.h>

int compare (void *first, void *second)
{
    if (*(int*)first > *(int*)second)
        return 1;
    else if (*(int*)first < *(int*)second)
        return -1;
    else 
        return 0;
}

struct point{
    int point[2][4];
    int result;
};

int main(){
    struct point *square;
    int test;
    int side[6];
    scanf("%d", &test);

    square = malloc(sizeof(struct point)*test);

    for (int i = 0; i < test; i++) {
        square[i].result = 0;
        for(int j = 0; j < 4; j++){
            scanf("%d %d", &square[i].point[0][j], &square[i].point[1][j]);
        }
    }
    for (int i = 0; i < test; i++) {
        int m = 0;
        for (int k = 0; k < 4; k++) {
            for (int j = k+1; j < 4; j++) {
                side[m] = (square[i].point[0][k]-square[i].point[0][j])*(square[i].point[0][k]-square[i].point[0][j]) + (square[i].point[1][k]-square[i].point[1][j])*(square[i].point[1][k]-square[i].point[1][j]);
                m++;
            }
        }
        qsort(side,sizeof(side)/sizeof(int),sizeof(int),compare);
        if (side[0] == side[1] && side[1] == side[2] && side[2] == side[3] && side[4] == side[5]) {
            square[i].result = 1;
        }
    }

    for (int i = 0; i < test; i++) {
        printf("%d\n", square[i].result);
    }
    free(square);
    return 0;
}