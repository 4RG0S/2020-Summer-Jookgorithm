import sys
from collections import deque

F, S, G, U, D = map(int, sys.stdin.readline().split())
depth = [-1 for _ in range(1000000 + 1)]
depth[S] = 0


def bfs():
    if S == G:
        return 0
    queue = deque([S])
    while queue:
        q = queue.popleft()
        if q == G:
            return depth[q]
        for delta in (U, -D):
            dq = q + delta
            if 0 < dq <= F and depth[dq] == -1:
                depth[dq] = depth[q] + 1
                queue.append(dq)
    return -1


a = bfs()
print('use the stairs' if a == -1 or a == '-1' else a)
