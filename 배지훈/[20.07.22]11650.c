//#include <stdio.h>
//#include <stdlib.h>
//
//struct Point{
//    int x,y;
//};
//
//int compare(const void* first, const void* second) {
//    struct Point a,b;
//    a = *(struct Point*)first;
//    b = *(struct Point*)second;
//
//    if(a.x > b.x)
//        return 1;
//    else if(a.x < b.x)
//        return -1;
//    else {
//        if(a.y > b.y)
//            return 1;
//        else if(a.y < b.y)
//            return -1;
//        else
//            return 0;
//    }
//}
//
//int main() {
//    int i, n;
//    struct Point pts[100000];
//    scanf("%d", &n);
//
//    for(i = 0; i < n; ++i)
//        scanf("%d %d", &pts[i].x, &pts[i].y);
//
//    compare(&pts[0], &pts[1]);
//    qsort(pts, n, sizeof(pts[0]), compare);
//
//    for(i = 0; i < n; ++i)
//        printf("%d %d\n", pts[i].x, pts[i].y);
//}