//14888 : 연산자 끼워넣기

#include <stdio.h>

int N=0, A, B, C, D;
int arr[11] = {0};
int o[10] = {0};
int min = 1000000000, max = -1000000000;

void func(int n, int a, int b, int c, int d) {
	int i=0, t=0;
	
	if (a > A || b > B || c > C || d > D)
		return;
	
	if (n == N-1) {
		t = arr[0];
		for (i=0; i<n; i++) {
			
			if (o[i] == 0)
				t += arr[i+1];
			else if (o[i] == 1)
				t -= arr[i+1];
			else if (o[i] == 2)
				t *= arr[i+1];
			else if (o[i] == 3)
				t /= arr[i+1];
		}
		if (t < min) min = t;
		if (t > max) max = t;
		
		return;
	}
	
	o[n] = 0;
	func(n+1, a+1, b, c, d);
	o[n] = 1;
	func(n+1, a, b+1, c, d);
	o[n] = 2;
	func(n+1, a, b, c+1, d);
	o[n] = 3;
	func(n+1, a, b, c, d+1);
	
}

int main() {
	int i=0;
	
	scanf("%d", &N);
	for (i=0; i<N; i++)
		scanf("%d", &arr[i]);
	scanf("%d %d %d %d", &A, &B, &C, &D);
	
	func(0, 0, 0, 0, 0);
	
	printf("%d\n%d", max, min);
	
	return 0;
}
