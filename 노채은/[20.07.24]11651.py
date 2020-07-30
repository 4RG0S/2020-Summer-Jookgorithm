#BOJ 11650

import sys

pos = []

for _ in range(int(sys.stdin.readline())):
    pos_x, pos_y = map(int, sys.stdin.readline().split())
    pos.append((pos_x, pos_y))

pos.sort()

for i in pos:
    print(*i)
