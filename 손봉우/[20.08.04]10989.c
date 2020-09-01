//10989 : 수 정렬하기3

#include <stdio.h> 

int main() {
	int c [10001] = {0};
	int i, n, t;
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++) {
		scanf("%d", &t);
		c[t]++;
	}
	
	for (i=0; i<10001; i++) {
		if (c[i] == 0)
			continue;
		for (t=0; t<c[i]; t++)
			printf("%d\n", i);
	}

	
	return 0;
	
}
