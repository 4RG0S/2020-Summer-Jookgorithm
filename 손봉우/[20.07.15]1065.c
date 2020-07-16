#include <stdio.h>

int main() {
	int n = 0;
	int i;
	int cnt;
	int p[3];
	scanf ("%d", &n);
	
	if (n < 100) {
		printf ("%d", n);
	}
	else if (n < 1000) {
		cnt = 99;
		for (i=100; i<=n; i++) {
			p[0] = i/100;
			p[1] = (i/10) % 10;
			p[2] = i%10;
			if ((p[2]-p[1]) == (p[1]-p[0]))
				cnt++;
		}
		printf ("%d", cnt);
	}
	else {
		printf ("%d", 144);
	}
	
	return 0;
	
}
