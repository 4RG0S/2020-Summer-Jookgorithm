from collections import deque

n, k = map(int, input().split())

queue = deque([[n, 0]])
visited = []

while queue:
    q, time = queue.popleft()
    if q not in visited:
        visited.append(q)
        if q == k:
            print(time)
            break

        if q + 1 <= 100000:
            queue.append([q + 1, time + 1])
        if q * 2 <= 100000:
            queue.append([q * 2, time + 1])
        if q - 1 >= 0:
            queue.append([q - 1, time + 1])
