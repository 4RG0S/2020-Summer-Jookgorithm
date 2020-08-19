//14889 : 스타트와 링크

#include <stdio.h>
#include <stdbool.h>
#include <math.h>

int n=0;
int arr[20][20] = {0};
bool visit[20] = {0};
int min = 10000000;

void func(int p, int cnt) {
	int i=0, j=0;
	int t1=0, t2=0, d=0;
	
	if (cnt == n/2) {
		for (i=0; i<n; i++) {
			for (j=0; j<n; j++) {
				if (visit[i] && visit[j])
					t1 += arr[j][i];
				else if (!visit[i] && !visit[j])
					t2 += arr[j][i];
			}
		}
		d = abs(t1-t2);
		
		if (d < min)
			min = d;
		
		return;
	}
	
	for (i=p+1; i<n; i++) {
		visit[i] = true;
		func(i, cnt+1);
		visit[i] = false;
	}
	
	return;
}

int main() {
	int i=0,j=0;
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++) {
		for (j=0; j<n; j++) {
			scanf("%d", &arr[j][i]);
		}
	}
	func(-1, 0);
	
	printf("%d", min);
	return 0;
}
