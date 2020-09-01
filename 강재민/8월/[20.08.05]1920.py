import sys
input=sys.stdin.readline

N = int(input())
X = input().split()
X = set(X)
M = int(input())
T = input().split()
for i in T:
    if( i in X ):
        print(1)
    else:
        print(0)