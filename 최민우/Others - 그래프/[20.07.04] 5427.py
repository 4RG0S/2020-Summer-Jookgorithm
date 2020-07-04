# TODO

# from collections import deque
#
# t = int(input())
# dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]
# w, h = -1, -1
#
#
# def manMove(x, y, field):
#     result = []
#     for dx, dy in dirs:
#         if 0 <= x + dx < w and 0 <= y + dy < h:
#             if field[y + dy][x + dx] == '.':
#                 result.append((x + dx, y + dy))
#         else:
#             return None
#     return result
#
#
# def bfs(field, manPos):
#     queue = deque([manPos])
#     time = 1
#     manVisit = []
#     while queue:
#         q = queue.popleft()
#         if q not in manVisit:
#             manVisit.append(q)
#             addition = manMove(q[0], q[1], field)
#             if addition is None:
#                 return time + 1
#             queue += addition
#     return -1
#
# for _ in range(t):
#     w, h = map(int, input().split())
#     array = []
#     for __ in range(h):
#         array.append(list(input()))
#     """
#     1) 사람이 그냥 빠르게 나가는 BFS 제작 후, field 를 불로 뒤덮자
#     """
#     manPos = -1
#     for y in range(h):
#         for x in range(w):
#             if array[y][x] == '@':
#                 manPos = (x, y)
#     print(bfs(array, manPos))
#     # print()
#     # pprint(field)
