//9461 : 파도반 수열

#include <stdio.h>

int main() {
	int t=0,n=0,i=0;
	long long arr[100] = {1, 1, 1, 2, 2, 0};
	
	scanf("%d", &t);
	
	for (i=5; i<100; i++)
		arr[i] = arr[i-1] + arr[i-5];
	
	for (i=0; i<t; i++) {
		scanf("%d", &n);
		printf("%lld\n", arr[n-1]);
	}
	
	return 0;
}
