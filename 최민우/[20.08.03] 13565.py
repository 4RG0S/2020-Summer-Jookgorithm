from collections import deque

dirs = [(0, 1), (0, -1), (1, 0), (-1, 0)]


def bfs(queue):
    global visited
    while queue:
        x, y = queue.popleft()
        if visited[y][x] == 0:
            visited[y][x] = 1
            if y == (m - 1):
                return 'YES'
            for dx, dy in dirs:
                if 0 <= x + dx < n and 0 <= y + dy < m:
                    if field[y + dy][x + dx] == '0':
                        queue.append([x + dx, y + dy])
    return 'NO'


m, n = map(int, input().split())
field = [list(input()) for _ in range(m)]
visited = [[0 for _ in range(n)] for _ in range(m)]

start = deque([i, 0] for i in range(n))
print(bfs(start))
