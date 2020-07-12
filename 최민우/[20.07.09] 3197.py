import sys
from collections import deque

# TODO 멘탈 바사삭

"""
입력
입력의 첫째 줄에는 R과 C가 주어진다. 단, 1 ≤ R, C ≤ 1500.

각 R줄 동안 C 만큼의 문자열이 주어진다.

'.'은 물 공간, 'X'는 빙판 공간, 'L'은 백조가 있는 공간으로 나타낸다.
1 0 2

출력
첫째 줄에 문제에서 주어진 걸리는 날을 출력한다.
"""


def bfs():
    global time_table, blank_pos, swan_pos, w, h
    bQueue = deque(blank_pos)
    current_time = 0

    # BLANK 의 이동
    while True:
        current_time += 1
        while bQueue:
            pos_x, pos_y = bQueue.popleft()
            if time_table[pos_y][pos_x] is not current_time:
                bQueue.insert(0, (pos_x, pos_y))
                break
            for dx, dy in dirs:
                if 0 <= pos_x + dx < w and 0 <= pos_y + dy < h:
                    if time_table[pos_y + dy][pos_x + dx] == 0:
                        time_table[pos_y + dy][pos_x + dx] = current_time + 1
                        bQueue.append((pos_x + dx, pos_y + dy))
        if swan_bfs(time_table, swan_pos[0], swan_pos[1]):
            return current_time


# 백조는 0이 아닌 곳을 움직일 수 있다.
def swan_bfs(table, begin, end):
    sQueue = deque([begin])
    visit = []
    while sQueue:
        pos_x, pos_y = sQueue.popleft()
        if (pos_x, pos_y) == end:
            return True
        if (pos_x, pos_y) not in visit:
            visit.append((pos_x, pos_y))
            for dx, dy in dirs:
                if 0 <= pos_x + dx < w and 0 <= pos_y + dy < h:
                    if table[pos_y + dy][pos_x + dx] != 0:
                        sQueue.append((pos_x + dx, pos_y + dy))
    return False


h, w = map(int, sys.stdin.readline().rstrip().split())
array = [list(sys.stdin.readline().rstrip()) for _ in range(h)]
time_table = [[0] * w for _ in range(h)]
dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]

blank_pos = []
swan_pos = []

for y in range(h):
    for x in range(w):
        if array[y][x] == '.':
            blank_pos.append((x, y))
            time_table[y][x] = 1
        elif array[y][x] == 'L':
            swan_pos.append((x, y))
            blank_pos.append((x, y))
            time_table[y][x] = 1

print(bfs())
