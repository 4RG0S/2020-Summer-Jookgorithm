#include <stdio.h>
int getnum() {
    int c=0,v,r=0;
    while ((v = getchar()) >= '0' && v <= '9'){
        r=r*10+v-'0';
        c=1;
    }
    return c?r:-1;
}
int main() {
    int i,k,v,s,r;
    int a[100000];
    k=getnum();
    for(i=0,s=0;i<k;++i) {
        while((v=getnum()) == -1);
        v!=0?a[s++]=v:--s;
    }
    for(i=0,r=0;i<s;++i)
        r+=a[i];
    printf("%d",r);
}