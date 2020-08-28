#include <stdio.h>

int arr[10000];

int main(){
    int N, tmp;

    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        scanf("%d", &tmp);
        arr[tmp-1]++;
    }

    for (int i = 0; i < 10000; i++) {
        if (arr[i] > 0) {
            for (int j = 0; j < arr[i]; j++) {
                printf("%d\n", i+1);
            }
        }
    }

    return 0;
}