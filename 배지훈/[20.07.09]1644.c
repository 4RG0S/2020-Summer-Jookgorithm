#include <stdio.h>

int arr[4000001];
int prime[300000];
int main() {
    int i,j, n, num_prime, sum, cnt =0;
    scanf("%d", &n);

    for(i = 2; i <= n; ++i) {
        arr[i] = i;
    }

    for(i = 2; i <= n; ++i) {
        if(arr[i] == 0)
            continue;
        for(j = i + i; j <= n; j += i)
            arr[j] = 0;
    }
    for(i = 2, num_prime = 0; i <= n; ++i)
        if(arr[i] != 0)
            prime[num_prime++] = arr[i];

    for(i = 0; i < num_prime; ++i) {
        sum = prime[i];
        for(j = i + 1; sum < n; ++j)
            sum += prime[j];

        if(sum == n)
            ++cnt;
    }

    printf("%d", cnt);
}