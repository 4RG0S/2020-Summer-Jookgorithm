#include <stdio.h>
char str[51];

int main() {
    int i, j, num, cnt;
    scanf("%d", &num);
    for(i = 0; i < num; ++i) {
        scanf("%s", str);
        for(j = 0, cnt = 0; str[j] != 0 && cnt >= 0; ++j) {
            str[j] == '(' ? (++cnt) : (--cnt);
        }
        cnt == 0 ? printf("YES\n") : (printf("NO\n"));
    }
}