#include <stdio.h>

int t,m,n,k,x,y,h,i,j,cnt;
int arr[50][50];
int visit[50][50];

void check_area(int ax, int ay) {
    visit[ax][ay] = 1;
    if(ax != m - 1 && arr[ax+1][ay] != 0 && visit[ax+1][ay] == 0)
        check_area(ax+1, ay);
    if(ax != 0 && arr[ax-1][ay] != 0 && visit[ax-1][ay] == 0)
        check_area(ax-1,ay);
    if(ay != n-1 && arr[ax][ay+1] != 0 && visit[ax][ay+1] == 0)
        check_area(ax, ay+1);
    if(ay != 0 && arr[ax][ay-1] != 0 && visit[ax][ay-1] == 0)
        check_area(ax, ay-1);
}
void clear() {
    int a,b;
    for(a = 0; a < m; ++a) {
        for(b = 0; b < n; ++b) {
            arr[a][b] = 0;
            visit[a][b] = 0;
        }
    }
}
int main() {
    scanf("%d", &t);
    for(h = 0; h < t; ++h) {
        scanf("%d%d%d", &m, &n, &k);
        for(i = 0; i < k; ++i) {
            scanf("%d%d", &x, &y);
            arr[x][y] = 1;
        }
        for (i = 0,cnt=0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                if (arr[i][j] != 0 && visit[i][j] == 0) {
                    visit[i][j] = 1;
                    ++cnt;
                    check_area(i, j);
                }
            }
        }
        printf("%d\n", cnt);
        clear();
    }
}