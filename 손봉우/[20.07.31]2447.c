//2447(s1) : º° Âï±â - 10

#include <stdio.h>
#include <memory.h>

char star[2187][2187];

void solve(int y, int x, int a) {
	int i,j = 0;
	
	if (a == 1) {
		star [y][x] = '*';
		return;
	}
		
	int div = a/3;
	
	for (i=0; i<3; i++) {
		for (j=0; j<3; j++) {
			if (i!=1 || j!=1)
				solve (y+(i*div), x+(j*div), div);
		}
	}
}

int main() {
	int t,i,j=0;
	memset (star, ' ', sizeof(star));
	
	scanf("%d", &t);
	
	solve(0,0,t);
	for (i=0; i<t; i++) {
		for (j=0; j<t; j++)
			printf("%c", star[i][j]);
		puts("");
	}
	return 0;
} 
