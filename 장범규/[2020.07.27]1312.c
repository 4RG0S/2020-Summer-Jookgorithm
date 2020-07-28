#include <stdio.h>

int main(){
    int A, B, N, result;

    scanf("%d %d %d", &A, &B, &N);

    for (int i = N; i > 0; i--) {
        A %= B;
        A *= 10;
        result = A/B;
    }
    printf("%d", result);
    
    return 0;
}