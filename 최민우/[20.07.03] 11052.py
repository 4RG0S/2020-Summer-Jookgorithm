amount = int(input())
price = [0]
price += list(map(int, input().split()))
dp = [i for i in price]
for i in range(1, amount + 1):
    for j in range(1, i + 1):
        dp[i] = max(dp[i], dp[j] + price[i - j])
print(dp[-1])
