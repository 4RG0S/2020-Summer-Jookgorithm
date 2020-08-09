#include <stdio.h>
#include <stdlib.h>

int compare_for_ascending(const void* first, const void* second) {
    if(*(int *)first > *(int *)second)
        return 1;
    else if(*(int *)first < *(int *)second)
        return -1;
    else
        return 1;
}

int compare_for_descending(const void* first, const void* second) {
    if(*(int *)first < *(int *)second)
        return 1;
    else if(*(int *)first > *(int *)second)
        return -1;
    else
        return 1;
}

int main() {
    int n,i,s=0;
    int a[50],b[50];
    scanf("%d", &n);

    for(i = 0; i < n; ++i)
        scanf("%d", &a[i]);

    for(i = 0; i < n; ++i)
        scanf("%d", &b[i]);

    qsort(a, n, sizeof(a[0]), compare_for_ascending);
    qsort(b, n, sizeof(b[0]), compare_for_descending);

    for(i = 0; i < n; ++i)
        s += a[i] * b[i];

    printf("%d", s);
}