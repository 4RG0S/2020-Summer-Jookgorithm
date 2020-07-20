# TODO 문제를 잘못읽음 다시 풀기

import sys
from collections import deque
from pprint import pprint

dirs = [(1, 0), (0, 1), (-1, 0), (0, -1)]


def bfs(start, visited):
    queue = deque([start])

    if start in visited:
        return False

    while queue:
        pos = queue.popleft()
        if pos not in visited:
            x, y = pos
            for dx, dy in dirs:
                if 0 <= x + dx < n and 0 <= y + dy < n:
                    if field[y + dy][x + dx] == field[y][x]:
                        queue.append((x + dx, y + dy))
            visited.add((x, y))
    return True


n = int(sys.stdin.readline().rstrip())
field = []

for _ in range(n):
    field.append(list(map(int, sys.stdin.readline().rstrip().split())))

test = [[' ' for _ in range(n)] for __ in range(n)]

result = 0
checked = set()
for w in range(n):
    for h in range(n):
        if bfs((h, w), checked):
            test[w][h] = 'Y'
            result += 1

pprint(test)
print(result)
