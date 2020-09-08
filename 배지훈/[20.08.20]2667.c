//#include <stdio.h>
//#include <stdlib.h>
//
//int n,cnt;
//int house[26][26];
//int visit[26][26];
//int compare(const void* a, const void* b) {
//    if(*(int *)a > *(int *)b)
//        return 1;
//    else if(*(int *)a < *(int *)b)
//        return -1;
//    else
//        return 0;
//}
//
//void group(int y, int x) {
//    visit[y][x] = 1;
//
//    if(y > 0 && house[y - 1][x] != 0 && visit[y - 1][x] == 0)
//        group(y - 1, x);
//    if(y < n && house[y + 1][x] != 0 && visit[y + 1][x] == 0)
//        group(y + 1, x);
//    if(x > 0 && house[y][x - 1] != 0 && visit[y][x - 1] == 0)
//        group(y, x -1);
//    if(x < n && house[y][x + 1] != 0 && visit[y][x + 1] == 0)
//        group(y, x + 1);
//
//    ++cnt;
//}
//
//int main() {
//    int i, j, k=0;
//    int arr[1000];
//    scanf("%d", &n);
//    for (i = 1; i <= n; ++i)
//        for (j = 1; j <= n; ++j)
//            scanf("%1d", &house[i][j]);
//
//    for(i = 1; i <= n; ++i) {
//        for(j = 1; j <= n; ++j) {
//            if(house[i][j] == 1 && visit[i][j] == 0) {
//                cnt = 0;
//                group(i, j);
//                arr[k] = cnt;
//                ++k;
//            }
//        }
//    }
//    qsort(&arr[0], k, sizeof(arr[0]), compare);
//    printf("%d\n", k);
//    for(i = 0; i < k; ++i)
//        printf("%d\n", arr[i]);
//}