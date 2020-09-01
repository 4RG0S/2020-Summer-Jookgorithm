import sys
from queue import PriorityQueue

input = sys.stdin.readline

queue = PriorityQueue()
for _ in range(int(input())):
    value = int(input())
    if value:
        queue.put(-1 * value)
    elif not queue.empty():
        print(-1 * queue.get())
    else:
        print(0)
