//2579 : 계단 오르기

#include <stdio.h>
#define M(a,b) (a > b ? a : b)

int main() {
	int i=0, n=0;
	int arr[300]={0};
	int dp[300]={0};
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++)
		scanf("%d", &arr[i]);
	
	dp[0] = arr[0];
	dp[1] = M(arr[0], arr[0]+arr[1]);
	dp[2] = M(arr[1]+arr[2], arr[0]+arr[2]);
	
	for (i=3; i<n; i++)
		dp[i] = M(arr[i] + dp[i-2], arr[i] + arr[i-1] + dp[i-3]);
	
	printf("%d", dp[n-1]);
	
	return 0;
}
