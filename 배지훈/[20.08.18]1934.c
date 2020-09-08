//#include <stdio.h>
//
//int gcd(int a, int b) {
//    int k;
//    while(b != 0) {
//        k = a % b;
//        a = b;
//        b = k;
//    }
//    return a;
//}
//
//int main() {
//    int n,i,x,y;
//    scanf("%d", &n);
//    for(i = 0; i < n; ++i) {
//        scanf("%d%d", &x, &y);
//        printf("%d\n", (x*y)/gcd(x,y));
//    }
//}