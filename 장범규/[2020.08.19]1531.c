#include <stdio.h>

int main()
{
    int pic[101][101] = {0}, N, M;
    int x1, x2, y1, y2, sum = 0;
    
    scanf("%d %d", &N, &M);
    
    for (int i = 0; i < N; i++) {
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                pic[x][y]++;
            }
        }
    }
    for (int i = 1; i <= 100; i++) { 
        for (int j = 1; j <= 100; j++) { 
            if (pic[i][j] > M) {
                sum++; 
            }    
        }
    }
    printf("%d", sum);
    return 0;
}