#include <stdio.h>
#include <queue>

using namespace std;
priority_queue<long long> card;
int main()
{
    long long tem,n,j,i,sum=0;
    scanf("%lld %lld",&n,&i);
    for(j=0;j<n;j++){
        scanf("%lld",&tem);
        card.push(-tem);
    }
    for(j=0;j<i;j++){
        tem = -card.top();
        card.pop();
        tem += -card.top();
        card.pop();
        card.push(-tem);
        card.push(-tem);
    }
    for(j=0;j<n;j++){
        sum -= card.top();
        card.pop();
    }
    printf("%lld",sum);

    return 0;
}
