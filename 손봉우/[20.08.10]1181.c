//1181 : 단어 정렬

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct word {
	char str[51];
};
typedef struct word word; 

word w[200000];

int compare (const void *a, const void *b) {
	word wa = * (word *)a;
	word wb = * (word *)b;
	
	if (strlen(wa.str) == strlen(wb.str))
		return strcmp (wa.str, wb.str);		//사전순으로 앞서면 음수 반환 
	
	return strlen(wa.str) > strlen(wb.str);	//길이로 정렬 
}

int main() {
	int n,i = 0;
	
	scanf("%d", &n);
	
	for (i=0; i<n; i++)
		scanf("%s", w[i].str);
	
	qsort (w, n, sizeof(w[0].str), compare);
	
	for (i=0; i<n; i++) {
		if (strcmp(w[i].str, w[i+1].str) != 0)
			puts(w[i].str);
	}
	
	return 0;
}
