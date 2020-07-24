//1012(s2) : DFS(±íÀÌ¿ì¼±Å½»ö) 

#include <stdio.h>

void dfs(int (*M)[50], int m, int n, int x, int y, int k) {
	int i,nx,ny=0;
	int vectx[4] = {1, -1, 0, 0};
	int vecty[4] = {0, 0, 1, -1};
	
	M[x][y] = k;
	
	for (i=0; i<4; i++) {
		nx = x + vectx[i];
		ny = y + vecty[i];
		if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
			if (M[nx][ny] == 1)
				dfs(M, m, n, nx, ny, k);
		}
	}
}
int main() {
	int t,i,m,n,k,i1,i2,a,b,r=0;
	int M[50][50] = {0,};
	
	
	scanf("%d", &t);
	
	for(i=0; i<t; i++) {
		r=0;
		scanf("%d %d %d", &m, &n, &k);
		
		for (a=0; a<k; a++) {
			scanf("%d %d", &i1, &i2);
			M[i1][i2] = 1;
		}
		for (a=0; a<m; a++) {
			for (b=0; b<n; b++) {
				if (M[a][b] == 1) {
					r++;
					dfs(M,m,n,a,b,r+1);
				}
			}
		}
		printf("%d\n", r);
	}
}
