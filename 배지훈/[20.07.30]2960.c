#include <stdio.h>

int main() {
    int n,k,i,j,cnt;
    int arr[1001];
    scanf("%d %d", &n, &k);
    for(i = 0; i <= n; ++i)
        arr[i] = 1;

    for(i = 2, cnt = 0; i <= n && cnt <= k; ++i) {
        if(arr[i] == 0)
            continue;
        for(j = i; j <= n; j += i) {
            if(arr[j] == 0)
                continue;
            arr[j] = 0;
            ++cnt;
            if(cnt == k) {
                printf("%d", j);
                break;
            }
        }
    }
}