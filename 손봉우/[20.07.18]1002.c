//1002(s4) : 6가지경우 

#include <stdio.h>
#include <math.h>

int main () {
	int i, t, x1, y1, r1, x2, y2, r2 = 0;
	float d;
	
	scanf("%d", &t);
	
	for (i=0; i<t; i++) {
		scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
		
		d = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
		if (r1+r2 < d || abs(r1-r2) > d)
			printf("0\n");
		else if (d == 0 && r1 == r2)
			printf("-1\n");
		else if (r1+r2 == d || abs(r1-r2) == d)
			printf("1\n");
		else
			printf("2\n");	 
	}
	
	return 0;
}
