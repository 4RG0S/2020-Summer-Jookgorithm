//11650 : 좌표 정렬하기

#include <cstdio>
#include <algorithm>

struct point {
	int x, y;
};

bool comp(point const &a, point const &b) {
	if (a.x == b.x) return a.y < b.y;
	return a.x < b.x;
}

int main() {
	int i, n, x, y;
	scanf("%d", &n);
	
	point p[100000];
	for (i=0; i<n; i++)
		scanf("%d %d", &p[i].x, &p[i].y);
	std::sort(p, p+n, comp);
	
	for (i=0; i<n; i++)
		printf("%d %d\n", p[i].x, p[i].y);
	
	return 0;
}
