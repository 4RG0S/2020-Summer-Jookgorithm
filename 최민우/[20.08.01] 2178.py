from collections import deque

dirs = [(0, 1), (0, -1), (1, 0), (-1, 0)]


def bfs():
    queue = deque([(0, 0, 0)])
    visited = []
    while queue:
        x, y, time = queue.popleft()
        q = (x, y)
        if q not in visited:
            visited.append(q)
            if q == (m - 1, n - 1):
                return time + 1
            for dx, dy in dirs:
                if 0 <= int(q[0]) + dx < m and 0 <= int(q[1]) + dy < n:
                    if field[int(q[1]) + dy][int(q[0]) + dx] == '1':
                        queue.append((int(q[0]) + dx, int(q[1]) + dy, time + 1))


n, m = map(int, input().split())
field = [list(input()) for _ in range(n)]
print(bfs())
