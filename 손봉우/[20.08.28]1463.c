//1463 : 1로 만들기

#include <stdio.h>
#define M(a,b) (a < b ? a : b) 

int dp[1000001] = {0, 0, 1, 1,};

int main() {
	int n=0,i=0;
	scanf("%d", &n);
	
	for (i=4; i<=n; i++) {
		if(i%3 == 0)
			dp[i] = M(dp[i-1]+1, dp[i/3]+1);
		else if (i%2 == 0)
			dp[i] = M(dp[i-1]+1, dp[i/2]+1);
		else
			dp[i] = dp[i-1]+1;
	}
	
	printf("%d", dp[n]);
	
	return 0;
}
