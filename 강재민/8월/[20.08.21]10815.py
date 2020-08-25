import sys
input=sys.stdin.readline
N = input()
l = list()
for i in range(0, len(N)-1):
    l.append(N[i:-1])
for i in sorted(l):
    print(i)
