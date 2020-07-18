//1004(s3) : 두 점이 모두 원에 있는 경우 제외 -> xor연산 

#include <stdio.h>
#include <math.h>

int main() {
	int t, n, c, i, j, x1, x2, y1, y2, rx, ry, r = 0;
	
	scanf ("%d", &t);
	for (i=0; i<t; i++) {
		scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
		scanf("%d", &n);
		c=0;
		for (j=0; j<n; j++) {
			scanf("%d %d %d", &rx, &ry, &r);
			if (pow(x1-rx,2) + pow(y1-ry,2) <= pow(r,2)
			^ pow(x2-rx,2) + pow(y2-ry,2) <= pow(r,2))
				c++;
		}
		printf ("%d\n", c);
	}
	
	return 0;
}
