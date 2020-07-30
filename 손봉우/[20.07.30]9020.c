//9020(s1) : ∞ÒµÂπŸ»Â¿« √ﬂ√¯ 

#include <stdio.h>
#include <stdbool.h>

int main() {
	int t,i,j,k,a = 0;
	bool prime[10002];
	
	for (i=2; i<10000; i++)
		prime[i] = true;
	prime[0] = false;
	prime[1] = false;
	
	for (i=2; ; i++) {
		if (i*i > 10000)
			break;
		if (prime[i]) {
			for (j=i*i; j<=10000; j++) {
				if (j%i == 0)
					prime[j] = false;
			}
		}
	}
	
	scanf ("%d", &t);
	
	for (i=0; i<t; i++) {
		scanf("%d", &a);
		
		for (j=a/2; j<a; j++) {
			for (k=a/2; k>=2; k--) {
				if (prime[j] && prime[k] && j+k == a)
					goto BREAK;
			}
		}
		
BREAK:
		if (a == 2)
			printf("1 1\n");
		else
			printf("%d %d\n", k, j);
	}
	
	return 0;
}
