import sys
input=sys.stdin.readline

N = int(input())
a = [0] * 10000
for i in range(N):
    c = int(input())
    a[c-1] += 1
count = 1
for i in a:
    for j in range(i):
        print(count)
    count += 1


