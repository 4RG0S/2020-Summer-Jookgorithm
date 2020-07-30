//#include <stdio.h>
//#include <stdlib.h>
//
//struct Member{
//    int age;
//    char name[101];
//};
//
//struct Member mem[100000];
//
//int compare(const void* first, const void* second) {
//    struct Member a,b;
//    a = *(struct Member*)first;
//    b = *(struct Member*)second;
//
//    if(a.age > b.age)
//        return 1;
//    else if(a.age < b.age)
//        return -1;
//    else
//        return 0;
//}
//int main() {
//    int i, n;
//    scanf("%d", &n);
//
//    for(i = 0; i < n; ++i)
//        scanf("%d %s", &mem[i].age, mem[i].name);
//
//    qsort(mem, n, sizeof(mem[0]), compare);
//
//    for(i = 0; i < n; ++i)
//        printf("%d %s\n", mem[i].age, mem[i].name);
//}