import sys
from itertools import combinations

input = sys.stdin.readline
flag = True

while flag:
    line = list(map(int, input().strip().split()))
    n = int(line[0])
    if n == 0:
        flag = False
        break

    for case in combinations(line[1:], 6):
        print(' '.join(map(str, case)))
    print()