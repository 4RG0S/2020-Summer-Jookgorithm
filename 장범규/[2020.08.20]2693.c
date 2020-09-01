#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b)
{
    int num1 = *(int *)a;
    int num2 = *(int *)b;

    if (num1 < num2)
        return -1;
    
    if (num1 > num2)
        return 1;
    
    return 0;
}

int main(){
    int arr[10], T;

    scanf("%d", &T);

    for (int i = 0; i < T; i++) {
        fgetc(stdin);
        scanf("%d %d %d %d %d %d %d %d %d %d", &arr[0], &arr[1], &arr[2], &arr[3], &arr[4], &arr[5], &arr[6], &arr[7], &arr[8], &arr[9]);
        qsort(arr, sizeof(arr)/sizeof(int), sizeof(int), compare);
        printf("%d\n", arr[7]);
    }

    return 0;
}