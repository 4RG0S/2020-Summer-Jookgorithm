from collections import deque


def bfs(start, reach):
    queue = deque([[start, 0]])
    visited = []
    while queue:
        q, distance = queue.popleft()
        if q not in visited:
            visited.append(q)
            # if q == reach
            if q == reach:
                return distance + 1
            queue += [(i, distance + 1) for i in friend[q]]


n, m = map(int, input().split())

friend = {}
for _ in range(m):
    a, b = map(int, input().split())

    if a not in friend:
        friend[a] = [b]
    elif b not in friend[a]:
        friend[a].append(b)

    if b not in friend:
        friend[b] = [a]
    elif a not in friend[b]:
        friend[b].append(a)

total_distance = []
for person in friend:
    kevin = 0
    for person_to_meet in friend:
        if person_to_meet is not person:
            # TODO 1 -> 3 과 3 -> 1의 값이 같음, 최적화 가능.
            kevin += bfs(person, person_to_meet)
    total_distance.append([person, kevin])

print(sorted(total_distance, key=lambda x: (x[1], x[0]))[0][0])
