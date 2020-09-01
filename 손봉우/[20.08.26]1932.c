//1932 : Á¤¼ö »ï°¢Çü

#include <stdio.h>

int main() {
	int n=0,i=0,j=0,max=0;
	int arr[500][501] = {0};
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++) {
		for (j=0; j<=i; j++)
			scanf("%d", &arr[j][i]);
	}
	
	for (i=1; i<n; i++) {
		for (j=0; j<=i; j++) {
			if (j==0)
				arr[j][i] += arr[j][i-1];
			else if (j==i)
				arr[j][i] += arr[j-1][i-1];
			else
				arr[j][i] += arr[j-1][i-1] < arr[j][i-1] ? arr[j][i-1] : arr[j-1][i-1];
			
			max = arr[j][i] > max ? arr[j][i] : max;
		}
	}

	printf("%d\n", max);
	return 0;
}
