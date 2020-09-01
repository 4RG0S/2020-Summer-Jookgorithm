#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void *a, const void *b)
{
    int num1 = *(int *)a;
    int num2 = *(int *)b;

    if (num1 < num2)
        return 1;
    
    if (num1 > num2)
        return -1;
    
    return 0;
}

int main(){
    char arr[11];
    
    scanf("%s", arr);

    int *num, len = strlen(arr);
    num = malloc(sizeof(int)*len);

    for (int i = 0; i < len; i++) {
        num[i] = arr[i]-'0';
    }

    qsort(num, len, sizeof(int), compare);
    
    for (int i = 0; i < len; i++) {
        printf("%d", num[i]);
    }

    free(num);
    return 0;
}