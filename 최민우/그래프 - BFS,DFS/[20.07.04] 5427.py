import sys
import time
from collections import deque
from pprint import pprint

t = int(sys.stdin.readline())
dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]

"""
불을 큐에 넣고 자식들로 하여금 번지게한다
사람도 큐에 넣고 자식들로 하여금 움직이게한다
time = 이동거리 / 최소 이동거리 = 최단시간
"""

"""
시간초과에 대해 직접 시뮬레이팅 의 결과를 확인하니
4번째 예제에서 사람은 이미 움직임을 다해서 멈췄는데
불들이 큐에 남아있어서 

"""


def bfs(field, struct, width, height, time_table):
    queue = deque(struct)
    visited = []
    life = 1
    while queue:
        pos = queue.popleft()
        isHuman = time_table[pos[1]][pos[0]]
        if isHuman:
            life -= 1
        if life or isHuman:
            if pos not in visited:
                visited.append(pos)
                for dx, dy in dirs:
                    if 0 <= pos[0] + dx < width and 0 <= pos[1] + dy < height:
                        if field[pos[1] + dy][pos[0] + dx] == '.':
                            queue.append((pos[0] + dx, pos[1] + dy))
                            if isHuman:
                                life += 1
                                time_table[pos[1] + dy][pos[0] + dx] = isHuman + 1
                    elif time_table[pos[1]][pos[0]]:
                        return time_table[pos[1]][pos[0]]
    return 'IMPOSSIBLE'


for _ in range(t):
    w, h = map(int, sys.stdin.readline().rstrip().split())
    array = []
    for __ in range(h):
        array.append(list(sys.stdin.readline().rstrip()))

    times = [[0 for ___ in range(w)] for __ in range(h)]

    # 불은 0 사람은 1
    start = []
    for y in range(h):
        for x in range(w):
            if array[y][x] == '*':
                start.append((x, y))
            elif array[y][x] == '@':
                times[y][x] = 1
                start.append((x, y))

    print(bfs(array, start, w, h, times))
