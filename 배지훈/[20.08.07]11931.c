#include <stdio.h>
#include <stdlib.h>

int arr[1000000];

int compare(const void* a, const void* b) {
    if(*(int *)a > *(int *) b)
        return -1;
    else if(*(int *)a < *(int *)b)
        return 1;
    else
        return 0;
}

int main() {
    int i,n;
    scanf("%d", &n);

    for(i = 0; i < n; ++i)
        scanf("%d", &arr[i]);

    qsort(arr, n, sizeof(arr[0]), compare);

    for(i = 0; i < n; ++i)
        printf("%d\n", arr[i]);
}