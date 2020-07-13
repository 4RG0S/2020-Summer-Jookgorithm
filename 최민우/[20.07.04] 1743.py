from collections import deque

dirs = [(0, -1), (0, 1), (1, 0), (-1, 0)]
n, m, k = map(int, input().split())
field = [[0 for _ in range(m)] for __ in range(n)]


def bfs(x, y):
    queue = deque([(x, y)])
    result = 0

    while queue:
        x, y = queue.popleft()
        result += 1
        field[y][x] = 0
        for dx, dy in dirs:
            if 0 <= x + dx < m and 0 <= y + dy < n:
                if field[y + dy][x + dx]:
                    field[y + dy][x + dx] = 0
                    queue.append((x + dx, y + dy))
    return result


for _ in range(k):
    y, x = map(int, input().split())
    field[y - 1][x - 1] = 1

max_value = 0

for x in range(m):
    for y in range(n):
        if field[y][x]:
            max_value = max(max_value, bfs(x, y))

print(max_value)
