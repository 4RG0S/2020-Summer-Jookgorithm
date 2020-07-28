import sys
from collections import deque

head = 'E'
dirs = {'N': (0, 1), 'S': (0, -1), 'E': (1, 0), 'W': (-1, 0)}


def chg_dir(crt_head, rot):
    dir_list = ['N', 'E', 'S', 'W']
    if rot == 'R':
        return dir_list[dir_list.index(crt_head) + 1 % 4]
    else:
        return dir_list[dir_list.index(crt_head) - 1]


pos_max = int(sys.stdin.readline().rstrip())
cmd = deque([])
for _ in range(int(sys.stdin.readline().rstrip())):
    time, direction = sys.stdin.readline().rstrip().split()
    cmd.append([int(time), direction])

time = 0
chg_time = 0
x, y = 0, 0
visited = []

while True:
    if (x, y) in visited or x < -pos_max or x > pos_max or y < -pos_max or y > pos_max:
        break
    visited.append((x, y))
    # 뱀 머리 회전
    if cmd:
        if cmd[0][0] == chg_time:
            chg_time = 0
            garbage, rotation = cmd.popleft()
            head = chg_dir(head, rotation)

    # 뱀 이동
    x += dirs[head][0]
    y += dirs[head][1]

    time += 1
    chg_time += 1

print(time)
