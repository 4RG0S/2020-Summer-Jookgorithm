//10814 : 나이순 정렬

#include <cstdio>
#include <algorithm>

typedef struct member {
	int age;
	char name[101];
} Member;

Member m[100000];


bool comp (Member a, Member b) {
	return a.age < b.age;
}

int main() {
	int n, i = 0;
	
	scanf ("%d", &n);
	
	for (i=0; i<n; i++)
		scanf ("%d %s", &m[i].age, m[i].name);
		
	std::stable_sort(m, m+n, comp);
	
	for (i=0; i<n; i++)
		printf ("%d %s\n", m[i].age, m[i].name);
	return 0;
}
