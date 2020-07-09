import sys

dp = [0] * (20000 + 1)
dp[0], dp[1] = 1, 1
sys.setrecursionlimit(50000)


def getDP(n):
    if dp[n] != 0:
        return dp[n]
    dp[n] = getDP(n - 1) * n
    while dp[n] % 10 == 0:
        dp[n] = dp[n] // 10
    dp[n] = dp[n] % 1000000
    return dp[n]


N = int(input())
for i in range(1, N + 1):
    getDP(i)

print(dp[N] % 10)
