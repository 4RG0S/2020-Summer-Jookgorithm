import sys
from collections import deque

imput = sys.stdin.readline


def bfs():
    queue = deque([1])
    visited = []
    while queue:
        q = queue.popleft()
        if q not in visited:
            visited.append(q)
            for i in network[q]:
                queue.append(i)

    return len(visited)


network = {}

garbage = input()
for _ in range(int(input())):
    a, b = map(int, input().split())

    if a not in network:
        network[a] = [b]
    elif b not in network[a]:
        network[a].append(b)

    if b not in network:
        network[b] = [a]
    elif a not in network[b]:
        network[b].append(a)

print(bfs() - 1)
