import sys
input=sys.stdin.readline

N = int(input())
a = list()
for i in range(N):
    a.append(float(input()))
a = sorted(a)
for i in a[:7]:
    print( '{:.3f}'.format(i) )