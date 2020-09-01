import sys
input=sys.stdin.readline
N = int(input())
M = list(map(int,input().split()))
M = list(set(M))
result = ""
for i in sorted( M ):
    result += str(i) + " "
print(result.strip())