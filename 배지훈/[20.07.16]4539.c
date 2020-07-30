#include <stdio.h>

int main() {
    int i, j, k, t, val, tmp_val, check = 0;
    scanf("%d", &t);

    for(i = 0; i < t; ++i) {
        scanf("%d", &val);
        if(val > 10) {
            j = 10;
            k = 5;
            tmp_val = val % j;
            while(val >= j) {
                if(tmp_val >= k) {
                    val /= j;
                    ++val;
                    val *= j;
                } else {
                    val /= j;
                    val *= j;
                }

                j *= 10;
                k *= 10;
                tmp_val = val % j;
            }
        }
        printf("%d\n", val);
    }
}