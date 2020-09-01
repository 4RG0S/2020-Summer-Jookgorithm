//1427 : 소트인사이드

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int compare (const void *a, const void *b) {
	int n1 = *(int *)a;
	int n2 = *(int *)b;
	
	if (n1 > n2)
		return -1;
	if (n1 < n2)
		return 1;
	return 0;
}

int main() {
	int n,i,m,c = 0;
	int arr[10] = {0};
	
	scanf("%d", &n);
	
	for (i=n; i>0; c++)
		i = (int)(i/10);
	
	for (i=c-1; i>=0; i--) {
		m = (int)pow(10, i);
		arr[i] = n/m;
		n %= m;
	}
	
	qsort(arr, c, sizeof(int), compare);
	
	for (i=0; i<c; i++)
		printf("%d", arr[i]);
		
	return 0;
}
