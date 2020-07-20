from collections import deque

n, m = map(int, input().split())
node = {}


def bfs(start):
    queue = deque([start])
    visited = []

    while queue:
        q = queue.popleft()
        if q not in visited:
            visited.append(q)
            queue += node[q]

    return visited


for _ in range(m):
    a, b = map(int, input().split())
    if a not in node:
        node[a] = [b]
    elif b not in node[a]:
        node[a].append(b)

    if b not in node:
        node[b] = [a]
    elif a not in node[b]:
        node[b].append(a)

node_list = [i for i in node]
count = 0
while node_list:
    node_list = list(set(node_list) - set(bfs(node_list[0])))
    count += 1
print(count)
