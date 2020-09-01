import sys
from collections import deque

input = sys.stdin.readline
dirs = [(1, 0, 0), (-1, 0, 0),
        (0, 1, 0), (0, -1, 0),
        (0, 0, 1), (0, 0, -1)]


def check():
    for i, j, k in null:
        if field[i][j][k] == 0:
            return False
    return True


def bfs():
    last_time = 0
    while queue:
        x, y, z, time = queue.popleft()
        last_time = time
        for dx, dy, dz in dirs:
            if 0 <= x + dx < m and 0 <= y + dy < n and 0 <= z + dz < h:
                if field[z + dz][y + dy][x + dx] == 0 and visited[z + dz][y + dy][x + dx] == 0:
                    visited[z + dz][y + dy][x + dx] = 1
                    field[z + dz][y + dy][x + dx] = 1
                    queue.append([x + dx, y + dy, z + dz, time + 1])

    return last_time


m, n, h = map(int, input().split())
field = [[list(map(int, input().split())) for _ in range(n)] for __ in range(h)]
visited = [[[0 for _ in range(m)] for _ in range(n)] for _ in range(h)]

queue = deque([])
null = deque([])
for i in range(len(field)):
    for j in range(len(field[i])):
        for k in range(len(field[i][j])):
            if field[i][j][k] == 1:
                queue.append([k, j, i, 0])
            elif field[i][j][k] == 0:
                null.append([i, j, k])

if queue:
    result = bfs()
    print(result if check() else -1)
else:
    print(0)
