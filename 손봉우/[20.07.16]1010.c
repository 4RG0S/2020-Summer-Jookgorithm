#include <stdio.h>

struct point {
	int n;
	int m;
};

int get (int a, int b) {
	int i=0;
	int result = 1;
	int d=1;
	
	for (i=0; i<b; i++) {
		result *= a-i;
		
		if (result % (i+1) == 0)
			result /= i+1;
		else
			d *= i+1; 
	}
	
	return result / d;
}

int main() {
	int t, i= 0;
	
	scanf ("%d", &t);
	
	struct point p[t];
	int result[t];
	
	for (i=0; i<t; i++)
		scanf("%d %d", &p[i].n, &p[i].m);
	
	for (i=0; i<t; i++)
		printf ("%d\n", get(p[i].m, p[i].n));
	return 0;
}
