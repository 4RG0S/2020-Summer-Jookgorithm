#BOJ 11726

import sys
sys.setrecursionlimit(100001)
d = []
for i in range(0, 1001) :
    d.append(-1)
def dp(a) :
    if a == 1 :
        return 1
    elif a == 2 :
        return 2
    elif d[a] != -1 :
        return d[a]
    else :
        d[a] = dp(a-1) + dp(a-2)
        return d[a]
print(dp(int(input()))%10007)
