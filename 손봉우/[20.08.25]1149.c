//1149 : RGB °Å¸®

#include <stdio.h>

int min(int a, int b) {
	return a < b ? a : b;
}

int main() {
	int n=0,i=0;
	int t1[3] = {0,};
	int t2[3] = {0,};
	int input[3] = {0,};
	int m = 0;
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++) {
		scanf("%d %d %d", &input[0], &input[1], &input[2]);
		t2[0] = t1[0], t2[1] = t1[1], t2[2] = t1[2];
		t1[0] = min (t2[1], t2[2]) + input[0];
		t1[1] = min (t2[0], t2[2]) + input[1];
		t1[2] = min (t2[0], t2[1]) + input[2];
	}
	
	printf("%d", min(min(t1[0], t1[1]), t1[2]));
	
	return 0;
}
