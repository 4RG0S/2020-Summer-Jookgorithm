//4948(s2) : 에라토스테네스의 체 

#include <stdio.h>
#include <stdbool.h>

#define M 246912

int main() {
	int i,j,a,c = 0;
	
	bool arr[M+1];
	
	for (i=2; i<=M; i++)
		arr[i] = true;
	arr[0] = false;
	arr[1] = false;
	
	for (i=2; i<=M; i++) {
		if (i*i >= M)
			break;
		if (arr[i]) {
			for (j=i+1; j<=M; j++) {
				if (j%i == 0)
					arr[j] = false;
			}
		}
	}
	
	while (1) {
		c=0;
		
		scanf("%d", &a);
		
		if (a == 0)
			break;
			
		for (i=a+1; i<=2*a; i++) {
			if (i == M)
				break;
			
			if (arr[i]) {
				c++;
			}
		}
		
		printf("%d\n", c);
	}
	
	
	return 0;
}
