#BOJ10989

import sys
N = int(input())
num = [0] * 10001

for i in range(N):
    a = int(sys.stdin.readline())
    num[a] = num[a] + 1

for j in range(len(num)):
    if num[j] != 0:
        for k in range(num[j]):
            print(j)
