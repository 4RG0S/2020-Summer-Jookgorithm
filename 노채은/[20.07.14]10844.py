#BOJ 10844

N = int(input())

dp = [1] * 10
dp[0] = 0

for i in range(1, N) :
    ans = [0] * 10
    for j in range(10) :
        if j == 0 :
            ans[1] += dp[j]
        elif j == 9 :
            ans[8] += dp[j]
        else :
            ans[j-1] += dp[j]
            ans[j+1] += dp[j]
    dp = ans

print(int(sum(dp) % 1000000000))
