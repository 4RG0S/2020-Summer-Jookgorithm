#BOJ 2156

import sys
n = int(sys.stdin.readline())
m = [0]
for _ in range(n):
    m.append(int(sys.stdin.readline()))

dp = [0 for _ in range(100010)]

for i in range(1, n+1):
    if i == 1:
        dp[1] = m[1]
    elif i == 2:
        dp[2] = m[2] + dp[1]
    else:
        dp[i] = max(m[i] + m[i-1] + dp[i-3], m[i] + dp[i-2], dp[i-1])

print(dp[i])
