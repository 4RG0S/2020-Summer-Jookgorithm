from collections import deque
from pprint import pprint

T = int(input())
dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]


def bfs(x, y, field, M, N):
    queue = deque()
    queue.append((x, y))
    while queue:
        x, y = queue.popleft()
        field[y][x] = 0
        for dx, dy in dirs:
            if 0 <= x + dx < M and 0 <= y + dy < N:
                if field[y + dy][x + dx]:
                    queue.append((x + dx, y + dy))
                    field[y + dy][x + dx] = 0


for t in range(T):
    M, N, K = map(int, input().split())
    field = [[0 for _ in range(M)] for i in range(N)]
    for i in range(K):
        x, y = map(int, input().split())
        field[y][x] = 1

    result = 0
    for x in range(M):
        for y in range(N):
            if field[y][x] == 1:
                bfs(x, y, field, M, N)
                result += 1

    print(result)
