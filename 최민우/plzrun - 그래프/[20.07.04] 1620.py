from collections import deque


def BFS(graph, start):
    """
    BFS 를 제작해보니 처음 시작 노드를 큐에 넣고
    큐를 하나씩 비워가며 큐에 있는 자손들을 큐에 넣는 형식이다
    """
    queue = deque()
    queue.append(start)
    visited = []

    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.append(node)
            if node in graph:
                var = list(set(graph[node]) - set(visited))
                var.sort()
                queue += var
    return " ".join(list(map(str, visited)))


def DFS(graph, start):
    """
    메인을 죽이고 그 자손들을 스택에 넣고
    스택에서 꺼내 죽인다고 생각해보니
    순서가 메인의 자손1 -> 자손1의 자손 / 자손2
    """
    stack = [start]
    visited = []

    while stack:
        node = stack.pop()
        if node not in visited:
            visited.append(node)
            if node in graph:
                var = list(set(graph[node]) - set(visited))
                var.sort(reverse=True)
                stack += var
    return " ".join(list(map(str, visited)))


n, m, v = map(int, input().split())
graph_list = {}

for _ in range(m):
    a, b = map(int, input().split())
    if a not in graph_list:
        graph_list[a] = [b]
    elif b not in graph_list[a]:
        graph_list[a].append(b)

    if b not in graph_list:
        graph_list[b] = [a]
    elif a not in graph_list[b]:
        graph_list[b].append(a)

print(DFS(graph_list, v))
print(BFS(graph_list, v))
