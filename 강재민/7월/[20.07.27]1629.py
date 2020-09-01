A, B, C = map(int, input().split())
B = format(B,'b')[::-1]
dp = [A]
for i in range(1,len(B)):
    dp.append( ( dp[i-1] * dp[i-1]) % C )
temp = 1
for i in range(0,len(B)):
    if(B[i] == '1'):
        temp *= dp[i]
print( temp % C )
