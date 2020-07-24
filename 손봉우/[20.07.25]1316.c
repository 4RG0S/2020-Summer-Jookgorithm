//1316(s5)

#include <stdio.h>
#include <stdbool.h>

int main() {
	int t,i,j,k,c,r = 0;
	char word[100][100] = {'\0', };
	char buf[100] = {'\0', };
	bool flag = false;
	scanf("%d", &t);
	
	for (i=0; i<t; i++) {
		scanf("%s", word[i]);
		c=0;
		for (j=0; j<100; j++){buf[j]='\0';}
		for (j=0; word[i][j]!='\0'; j++) {
			flag = false;
			if (c!=0 && word[i][j]==buf[c-1])
				continue;
			for (k=0; k<c; k++) {
				if (buf[k] == word[i][j])
					flag = true;
			}
			if (flag)
				break;
			buf[c++] = word[i][j];
		}
		if (!flag)
			r++;
	}
	printf("%d", r);
	
	return 0;
}
