#BOJ 11651

import sys

n, points = int(input()), dict()

for _ in range(n) :
    x, y = map(int, sys.stdin.readline().split())
    if y in points.keys() : points[y].append(x)
    else : points[y] = [x]

for y in sorted(points.items(), key=lambda x:x[0]) :
    for x in sorted(y[1]) :
        print(x, y[0])
