#include <stdio.h>

#define MIN(a,b) ((a < b)? a : b)
int main() {
    int n,k,i,a=0,b=0;
    scanf("%d", &n);
    for(i = 1; i <= n; ++i) {
        k = i;
        while(1) {
            if(k % 2 != 0)
                break;
            else {
                k /= 2;
                ++a;
            }
        }
        k = i;
        while(1) {
            if(k % 5 != 0)
                break;
            else {
                k /= 5;
                ++b;
            }
        }
    }

    printf("%d", MIN(a,b));
}