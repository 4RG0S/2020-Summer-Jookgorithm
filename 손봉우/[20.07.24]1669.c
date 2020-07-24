//1669(s1) : similar with 1011, pow()is necessary but i don't know why 
#include <stdio.h>
#include <math.h>

int main() {
	int x, y, a, i = 0;
	
	scanf("%d %d", &x, &y);
	a = y - x;

	for (i=1; pow(i,2)<a; i++) {}
	if (a <= pow(i,2)-i)
		printf("%d", 2*i-2);
	else
		printf("%d", 2*i-1);
		
	return 0;
}
