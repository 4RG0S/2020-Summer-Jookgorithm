#BOJ 2133

import sys

num = int(sys.stdin.readline())

D = [0 for i in range(num+1)]

D[1] = 0

if num >= 2:
    D[2] = 3

for i in range(3, num+1):
    D[i] = 3*D[i-2]
    for j in range(i-4, 0, -2):
        D[i] += 2*D[j]
    if i % 2 == 0:
        D[i] += 2

sys.stdout.write(str(D[num]))
