//15649 : N°ú M (1) 

#include <stdio.h>
#include <stdbool.h>

int arr[9] = {0};
bool check[9];

void swap (int* a, int* b) {
	int t;
	t=*a; *a=*b; *b=t;
}

void solve (int n, int m, int cnt) {
	int i=0;
	
	if (m == cnt) {
		for (i=0; i<m; i++)
			printf("%d ", arr[i]);
		puts("");
	}
	else {
		for (i=1; i<=n; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[cnt] = i;
				solve(n, m, cnt+1);
				check[i] = false;
			}
		}
	}
}

int main() {
	int m,n,i = 0;
	
	scanf("%d %d", &n, &m);
		
	solve(n, m, 0);
	
	return 0;
} 

