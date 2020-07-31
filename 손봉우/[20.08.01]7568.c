//7568 : µ¢Ä¡ 

#include <stdio.h>

int main() {
	int arr [50][2] = {0};
	int ans [50] = {0};
	int n,i,j,h,w = 0;
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++)
		scanf("%d %d", &arr[i][0], &arr[i][1]);
	
	for (i=0; i<n; i++) {
		for (j=0; j<n; j++) {
			if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
				ans[i]++;
		}
	}
	
	for (i=0; i<n; i++)
		printf("%d ", ans[i]+1);
	
	
	return 0;
}
