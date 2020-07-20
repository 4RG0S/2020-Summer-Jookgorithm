import sys
import heapq

t = int(sys.stdin.readline().rstrip())
heap = []
for _ in range(t):
    cmd = int(sys.stdin.readline().rstrip())
    if cmd == 0:
        if len(heap):
            print(heapq.heappop(heap))
        else:
            print(0)
    else:
        heapq.heappush(heap, cmd)
