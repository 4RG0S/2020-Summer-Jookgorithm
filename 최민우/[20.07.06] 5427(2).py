import sys
from collections import deque

t = int(sys.stdin.readline().rstrip())
dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]


def bfs(person_start, fire_start, time_table, width, height):
    pQueue = deque(person_start)
    fQueue = deque(fire_start)

    time = 0

    while pQueue:
        time += 1
        while fQueue:
            pos_x, pos_y = fQueue.popleft()
            if time_table[pos_y][pos_x] is not time:
                fQueue.insert(0, (pos_x, pos_y))
                break
            for dx, dy in dirs:
                if 0 <= pos_x + dx < width and 0 <= pos_y + dy < height:
                    if time_table[pos_y + dy][pos_x + dx] == 0:
                        time_table[pos_y + dy][pos_x + dx] = time + 1
                        fQueue.append((pos_x + dx, pos_y + dy))

        while pQueue:
            pos_x, pos_y = pQueue.popleft()
            if time_table[pos_y][pos_x] is not time:
                # 이부분 때문에 한번 더 틀렸다 ㅠㅠ
                pQueue.insert(0, (pos_x, pos_y))
                break
            for dx, dy in dirs:
                if 0 <= pos_x + dx < width and 0 <= pos_y + dy < height:
                    if time_table[pos_y + dy][pos_x + dx] == 0:
                        time_table[pos_y + dy][pos_x + dx] = time + 1
                        pQueue.append((pos_x + dx, pos_y + dy))
                else:
                    return time

    return 'IMPOSSIBLE'


"""
처음 생각은 field 를 챙겨야한다는 점이였지만 초반 빼고 쓰지 않았다.
time_table 을 제작하여 이동경로 확인 + 시간체크의 역할을 해서 시간을 효과적으로 줄였다.
"""

for case in range(t):
    w, h = map(int, sys.stdin.readline().rstrip().split())
    array = [list(sys.stdin.readline().rstrip()) for _ in range(h)]
    times = [[0] * w for _ in range(h)]

    person_init = []
    fire_init = []

    for y in range(h):
        for x in range(w):
            if array[y][x] == '*':
                fire_init.append((x, y))
                times[y][x] = 1
            elif array[y][x] == '@':
                person_init.append((x, y))
                times[y][x] = 1
            elif array[y][x] == '#':
                times[y][x] = 9
                # 어 이거 원래 -1하려다가 잠깐 출력해본다고 9로 했는데 통과됐네

    print(bfs(person_init, fire_init, times, w, h))
