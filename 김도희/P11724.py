import sys
sys.setrecursionlimit(10000)
n, m = map(int, sys.stdin.readline().split())
arr = [[0]*(n+1) for i in range(n+1)]
visit = [0 for i in range(n+1)]
count = 0

def dfs(v):
    visit[v] = 1
    for x in range(1, n+1):
        if arr[v][x] == 1 and visit[x] == 0:
            dfs(x)

for i in range(m):
    v1, v2 = map(int, sys.stdin.readline().split())
    arr[v1][v2] = 1
    arr[v2][v1] = 1

for i in range(1, n+1):
    if visit[i] == 0:
        dfs(i)
        count += 1
print(count)