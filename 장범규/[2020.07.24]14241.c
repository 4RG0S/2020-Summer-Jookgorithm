#include <stdio.h>

int main(){
    int N, size, input, tmp;
    long long score;

    scanf("%d", &N);

    size = 0;
    score = 0;
    for (int i = 0; i < N; i++) {
        fgetc(stdin);
        scanf("%d", &input);
        if (i != 0) {
            size += tmp;
            score += (long long) (size*input);
        }
        tmp = input;
    }

    printf("%lld", score);

    return 0;
}