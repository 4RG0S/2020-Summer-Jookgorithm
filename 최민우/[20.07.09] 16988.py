from collections import deque
from itertools import combinations

dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]


def bfs(start_pos):
    global visited, m, n
    queue = deque([start_pos])
    isComplete = True

    count = 0
    while queue:
        pos = queue.popleft()
        if pos not in visited:
            visited.append(pos)
            count += 1
            pos_x, pos_y = pos
            for dx, dy in dirs:
                if 0 <= pos_x + dx < m and 0 <= pos_y + dy < n:
                    if field[pos_y + dy][pos_x + dx] == 0:
                        isComplete = False
                    if field[pos_y + dy][pos_x + dx] == 2:
                        queue.append((pos_x + dx, pos_y + dy))
    return count if isComplete else 0


n, m = map(int, input().split())
field = [list(map(int, input().split())) for _ in range(n)]

white_pos = []
blank_pos = []
visited = []

for y in range(n):
    for x in range(m):
        if field[y][x] == 2:
            white_pos.append((x, y))
        elif field[y][x] == 0:
            blank_pos.append((x, y))

comb_pos = list(combinations(blank_pos, 2))
max_result = 0

for black_pos in comb_pos:
    visited = []
    for x, y in black_pos:
        field[y][x] = 1
    result = 0
    for w_pos in white_pos:
        result += bfs(w_pos)
    max_result = max(max_result, result)

    for x, y in black_pos:
        field[y][x] = 0

print(max_result)
