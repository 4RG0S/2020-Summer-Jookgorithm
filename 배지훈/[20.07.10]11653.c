#include <stdio.h>

int main() {
    int i,n;
    scanf("%d", &n);

    while(n != 1) {
        i = 2;
        while(n % i != 0)
            ++i;
        n /= i;
        printf("%d\n", i);
    }
}