"""
입력
- 첫째 줄에 바둑판의 행의 갯수와 열의 갯수를 나타내는 N(3 ≤ N ≤ 20)과 M(3 ≤ M ≤ 20)이 한 칸의 빈칸을 사이에 두고 주어진다.
- 그 다음 N개의 줄에는 각 줄마다 배열의 각 행을 나타내는 M개의 정수가 한 개의 빈 칸을 사이에 두고 주어진다.
- 각 칸에 들어가는 값은 0, 1, 2이다. 0은 빈 칸, 1은 나의 돌, 2는 상대의 돌을 의미한다.
- 빈 칸이 2개 이상 존재함과 현재 바둑판에서 양 플레이어 모두 상대방의 돌로 빈틈없이 에워싸인 그룹이 없음이 모두 보장된다.

출력
- 첫째 줄에 현재 판에서 돌 2개를 두어 죽일 수 있는 상대 돌의 최대 갯수를 출력한다.
"""

from collections import deque

dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]


# 빈칸(0)에 검은돌(1)을 두개씩 넣고 BFS 를 돌려볼까?
def bfs(init_pos):
    queue = deque([init_pos])
    flag = True
    return_value = 0
    while queue:
        pos = queue.popleft()
        if pos not in visited:
            visited.append(pos)
            pos_x, pos_y = pos
            for dx, dy in dirs:
                if 0 <= pos_x + dx < m and 0 <= pos_y + dy < n:
                    if field[pos_y + dy][pos_x + dx] == 0:
                        flag = False
                    if field[pos_y + dy][pos_x + dx] == 2:
                        queue.append((pos_x + dx, pos_y + dy))
    return return_value if flag else 0


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

result = 0

for i in range(1, len(blank_pos)):
    for j in range(0, i):
        sel1, sel2 = blank_pos[i], blank_pos[j]
        field[sel1[1]][sel1[0]] = 1
        field[sel2[1]][sel2[0]] = 1
        visited = []
        sum_value = 0
        for start_pos in white_pos:
            sum_value += bfs(start_pos)
        result = max(result, sum_value)
        field[sel1[1]][sel1[0]] = 0
        field[sel2[1]][sel2[0]] = 0
print(result)
