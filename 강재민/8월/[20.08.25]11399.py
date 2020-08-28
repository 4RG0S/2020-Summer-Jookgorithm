import sys
input=sys.stdin.readline

N = int(input())
a = list(map(int, input().split()))
a = sorted(a)
s = 0
result = 0
for i in a:
    s += i
    result += s
print(result)
