from collections import deque

n = int(input())
field = [list(input()) for _ in range(n)]
dirs = [(0, 1), (0, -1), (1, 0), (-1, 0)]


def bfs(x, y):
    global visited
    visit = []
    queue = deque([(x, y)])
    while queue:
        q = queue.popleft()
        if q not in visit:
            visit.append(q)
            x, y = q
            for dx, dy in dirs:
                if 0 <= x + dx < n and 0 <= y + dy < n:
                    if field[y + dy][x + dx] == '1':
                        queue.append((x + dx, y + dy))
    visited += visit
    return len(visit)


visited = []
result = []
for i in range(n):
    for j in range(n):
        if (i, j) not in visited and field[j][i] == '1':
            result.append(bfs(i, j))

print(len(result))
print('\n'.join(map(str, sorted(result))))
