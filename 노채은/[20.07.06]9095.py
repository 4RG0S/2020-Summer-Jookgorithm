#BOJ 9095

import sys
T = int(sys.stdin.readline())
answer = [1, 2, 4]

for i in range(3, 11) :
    answer.append(sum(answer[-3:]))

for i in range(T) :
    n = int(sys.stdin.readline())
    print(answer[n-1])
