"""
가장 먼저 든 생각은 depth 느낌으로 2중 배열을 이용하면 될거같네요
"""

dp = [[0 for _ in range(200 + 1)] for __ in range(200 + 1)]

for n in range(200 + 1):
    dp[n][1] = 1
# n -> number, k = depth
for k in range(1, 200 + 1):
    for n in range(200 + 1):
        for d in range(n + 1):
            dp[n][k] += dp[d][k - 1]
n, k = map(int, input().split())

print(dp[n][k] % 1000000000)
# 2133번보다 쉬운거 같다
