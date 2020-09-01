//15651 : N°ú M(4)

#include <stdio.h>

int arr[8] = {0};

void recursive (int n, int m, int cnt, int p) {
	int i=0;
	
	if (cnt == m) {
		for (i=0; i<m; i++)
			printf("%d ", arr[i]);
		puts("");
		return;
	}
	for (i=1; i<=n; i++) {
		if (p <= i) {
			arr[cnt] = i;
			recursive (n, m, cnt+1, i);
		}
	}
	
}
int main() {
	int n,m=0;
	
	scanf ("%d %d", &n, &m);
	recursive (n, m, 0, 0);
	
	return 0;
}
