#include <stdio.h>

void get(int n) {
	int a[2] = {1, 0};
	int b[2] = {0, 1};
	int t[2] = {0, };
	int i;
	
	if (n == 0)
		printf ("1 0\n");
	else if (n == 1)
		printf ("0 1\n");
	else {
		for (i=2; i<=n; i++) {
			t[0] = a[0]; t[1] = a[1];
			a[0] = b[0], a[1] = b[1];
			b[0] = t[0]+b[0];
			b[1] = t[1]+b[1];
		}
		
		printf("%d %d\n", b[0], b[1]);
	}
	
}

int main() {
	int t, i, n= 0;
	
	scanf("%d", &t);
	
	for (i=0; i<t; i++) {
		scanf("%d", &n);

		get (n);
	}
	
}
