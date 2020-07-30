#include <stdio.h>
#include <stdlib.h>

int arr[1000][10];
int compare(const void *a, const void *b) {
    if(*(int *)a > *(int *)b)
        return 1;
    else if(*(int *)a < *(int *)b)
        return -1;
    else
        return 0;
}
int main() {
    int i, j, t;
    scanf("%d", &t);

    for(i = 0; i < t; ++i) {
        for(j = 0; j < 10; ++j)
            scanf("%d", &arr[i][j]);
    }
    for(i = 0; i < t; ++i) {
        qsort(arr[i], 10, sizeof(int), compare);
        printf("%d\n", arr[i][7]);
    }
}