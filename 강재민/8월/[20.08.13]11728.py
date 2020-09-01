import sys
input=sys.stdin.readline
N, M = map(int, input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
result = ""
for i in sorted( A + B ):
    result += str(i) + " "
print(result.strip())