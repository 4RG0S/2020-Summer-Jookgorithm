//15650 : N°ú M (2) 

#include <stdio.h>
#include <stdbool.h>

int arr[9] = {0};

void func (int n, int m, int cnt, int p) {
	int i=0;
	
	if (cnt == m) {
		for (i=0; i<m; i++)
			printf("%d ", arr[i]);
		puts("");
	}
	else {
		for (i=1; i<=n; i++) {
			if (i > p) {
				arr[cnt] = i;
				func(n, m, cnt+1, i);
			}
		}	
	}
}

int main() {
	int m,n = 0;
	
	scanf ("%d %d", &n, &m);
	
	func(n, m, 0, 0);
	
	return 0;
}
