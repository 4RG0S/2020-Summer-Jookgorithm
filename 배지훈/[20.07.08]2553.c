#include <stdio.h>

int main() {
    long long int i,n;
    long long int res = 1;
    scanf("%d", &n);
    for(i = 2; i < n + 1; ++i) {
        res = (res * i) % 1000000000000;
        while(res % 10 == 0) {
            res /= 10;
        }
    }
    printf("%d\n", res % 10);
}