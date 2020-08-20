import sys
input=sys.stdin.readline
N, M = map(int , input().split())
inp = map(int , input().split())
inp = sorted(inp)
print(inp[M-1])