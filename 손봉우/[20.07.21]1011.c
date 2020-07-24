//1011(s1)
//a^2 < y-x <= a^2+a  :  2a
//a^2+a < y-x < (a+1)^2  :  2a+1
#include <stdio.h>
#include <math.h>

int main() {
	int i,t,x,y,a,b=0;
	
	scanf("%d", &t);
	
	for (i=0; i<t; i++) {
		scanf("%d %d", &x, &y);
		b=0;
		for(a=0; b==0; a++) {
			if (pow(a+1,2) == y-x)
				b = 2*(a+1)-1;
			else if (pow(a+1,2) > y-x) {
				if (pow(a,2)+a >= y-x)
					b = 2*a;
				else
					b = 2*a+1;
			}
		}
		printf("%d\n", b);
	}
	
	
	return 0;
}
