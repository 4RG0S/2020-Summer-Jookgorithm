//2108 : Åë°èÇĞ

#include <stdio.h> 
#include <stdlib.h>

int compare(const void *a, const void *b) {
	int num1 = *(int *)a;
	int num2 = *(int *)b;
	
	if (num1 < num2)
		return -1;
	if (num1 > num2)
		return 1;
		
	return 0;
}

int main() {
	int arr[500000] = {0};
	int f[8001] = {0};
	int sum, n, i = 0;
	int mf = 1;
	int m1, m2 = 4001;
	
	scanf("%d", &n);
	for (i=0; i<n; i++) {
		scanf("%d", &arr[i]);
		sum += arr[i];
		f[arr[i]+4000]++;
	}
	qsort(arr, n, sizeof(int), compare);
	
	for (i=0; i<8001; i++) {
		if (f[i] >= mf)
			mf = f[i];
	}
	for (i=0; i<8001; i++) {
		if (f[i] == mf && i-4000 < m1)
			m1 = i-4000;
	}
	for (i=0; i<8001; i++) {
		if (f[i] == mf && m1 != i-4000 && i-4000 < m2) {
			m2 = i-4000;
		}
			
	}
	
	printf("%1.lf\n", (double)sum/n);
	printf("%d\n", arr[(n-1)/2]);
	printf("%d\n", m2!=4001?m2:m1);
	printf("%d\n", arr[n-1]-arr[0]);
	
	
	
	return 0;
}
