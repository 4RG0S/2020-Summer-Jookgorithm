//1018

#include <stdio.h>

int main() {
	int c1, c2, i, j, a, b, h, w = 0;
	int m = 65;
	char board[50][50];
	
	scanf ("%d %d", &h, &w);
	
	for (i=0; i<h; i++)
		scanf("%s", board[i]);
 
	for (i=0; i<h-7; i++) {
		for (j=0; j<w-7; j++) {
			
			c1 = 0;
			c2 = 0;
			
			for (a=i; a<i+8; a++) {
				for (b=j; b<j+8; b++) {
					if ((a+b) % 2 == 0) {
						if (board[a][b] == 'W')
							c1++;
						else
							c2++;
					}
					else {
						if (board[a][b] == 'B')
							c1++;
						else
							c2++;
					}
				}
			}
			m = m < c1 ? m : c1;
			m = m < c2 ? m : c2;
		}
	}
	printf("%d", m);
	
	return 0;
}
