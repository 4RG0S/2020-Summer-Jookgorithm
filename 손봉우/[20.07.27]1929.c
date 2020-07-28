//1929(s2) : 에라토스테네스의 체 

#include <stdio.h>
#include <stdbool.h>

int main() {
	int m,n,i,j = 0;
	
	scanf("%d %d", &m, &n);
	bool arr[1000002];
	
	for (i=2; i<=n; i++)
		arr[i] = true;
	arr[1] = false;
	
	for (i=2; i<=n; i++) {
		if (i*i >= n)
			break;
		if (arr[i]) {
			for(j=i*i; j<=n; j++) {
				if (j%i == 0)
					arr[j] = false;
			}	
		}
	}
	
	for (i=m; i<=n; i++) {
		if (arr[i]) {
			printf("%d\n", i);
		}
	}
	return 0;
	
}
