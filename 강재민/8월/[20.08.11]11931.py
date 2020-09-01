import sys
input=sys.stdin.readline

N = int(input())
a = list()
for i in range(N):
    a.append(int(input()))
for j in sorted(a, reverse=True):
    print(j)