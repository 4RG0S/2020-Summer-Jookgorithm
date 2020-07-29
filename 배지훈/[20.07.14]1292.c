#include <stdio.h>

int arr[1001];

int main() {
    int a,b,i,j,cnt;
    scanf("%d %d", &a, &b);
    arr[1] = 1;
    for(i = 2, j = 2, cnt = 0; i < 1001; ++i) {
        arr[i] = arr[i-1] + j;
        ++cnt;
        if(j == cnt) {
            cnt = 0;
            ++j;
        }
    }
    printf("%d", arr[b] - arr[a-1]);
}