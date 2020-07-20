#include <stdio.h>

int main(){
    int X, r = 0;

    scanf("%d", &X);

    while (X != 0) {
        if (X%2 == 1) {
            r++;
        }
        X /= 2;
    }
    printf("%d", r);
    return 0;
}