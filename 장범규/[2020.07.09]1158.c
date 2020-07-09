#include <stdio.h>
#include <stdlib.h>

int main(){
    int arrlen, interval;
    scanf("%d %d", &arrlen, &interval);

    int *arr = malloc(sizeof(int)*arrlen);
    int *del = malloc(sizeof(int)*arrlen);

    for (int i = 0; i < arrlen; i++) {
        arr[i] = i+1;
    }

    int order = interval;
    for (int i = 0; i < arrlen; i++) {
        del[i] = arr[order-1];
        arr[order-1] = 0;
        for (int j = 0; j < interval; j++) {
            order++;
            if (order > arrlen) {
                order -= arrlen;
            }
            int chk = 0;
            while (arr[order-1] < 1 || arr[order-1] > arrlen) {
                order++;
                
                if (order > arrlen) {
                    order -= arrlen;
                }
                chk++;
                if (chk > arrlen) {
                    break;
                }
            }
        }
    }

    printf("<");
    for (int i = 0; i < arrlen-1; i++) {
        printf("%d, ", del[i]);
    }
    printf("%d>\n", del[arrlen-1]);
    
    free(arr);
    free(del);
    return 0;
}