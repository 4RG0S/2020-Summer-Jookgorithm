#BOJ 11052

N = int(input())
pack = list(map(int, input().split()))
dp = []
dp.insert(0, 0)
dp.insert(1, pack[0])
for i in range(2, N+1) :
    dp.insert(i, pack[i-1])
    for j in range(1, i) :
        ans = max((dp[i-j]+pack[j-1]), pack[i-1])
        if dp[i] < ans :
            dp.insert(i, ans)
print(dp[N])
