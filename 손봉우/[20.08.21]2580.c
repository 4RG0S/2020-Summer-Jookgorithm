//2580 : ½ºµµÄí

#include <stdio.h>
#include <stdbool.h>

int board[9][9] = {0};
int c=0;

typedef struct _Point {
	int x, y;
}Point;

Point p[81];

bool func(int cnt) {
	int i=0,j=0;
	int chk[10] = {0};
	bool result = false;
	
	if (cnt == c)
		return true;
	
	for (i=0; i<9; i++)
		chk[board[i][p[cnt].y]] = chk[board[p[cnt].x][i]] = 1;
	for (i=0; i<3; i++) {
		for (j=0; j<3; j++)
			chk[board[p[cnt].x/3*3+j][p[cnt].y/3*3+i]] = 10;
	}
	
	for(i=1; i<=9; i++) {
		if (chk[i] == 0) {
			board[p[cnt].x][p[cnt].y] = i;
			result = func(cnt+1);
			if (result)	break;
			board[p[cnt].x][p[cnt].y] = 0;	
		}
	}
	return result;
}


int main() {
	int i,j=0;
	
	for (i=0; i<9; i++) {
		for (j=0; j<9; j++) {
			scanf("%d", &board[j][i]);
			if (board[j][i] == 0)
				p[c].x=j, p[c++].y=i;
		}
	}
	
	func(0);
	
	for (i=0; i<9; i++) {
		for (j=0; j<9; j++)
			printf ("%d ", board[j][i]);
		puts("");
	}
	
	return 0;
}
