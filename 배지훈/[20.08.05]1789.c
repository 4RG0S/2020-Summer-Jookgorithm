#include <stdio.h>

int main() {
    long long int s,a=0,i=1;
    scanf("%d", &s);
    while(a < s) {
        a += i;
        ++i;
    }
    --i;
    if(a - s != 0)
        --i;
    printf("%d", i);
}