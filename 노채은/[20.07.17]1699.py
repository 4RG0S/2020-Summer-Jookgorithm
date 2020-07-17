#BOJ 1699

import math

N = int(input())
dp = [0]
for i in range(1, N+1) :
    min = i
    for j in range(1, int(math.sqrt(i))+1) :
        t = j**2
        if i == t :
            min = 1
        else :
            ans = dp[i-t]+1
            if ans < min :
                min = ans
    dp.append(min)

print(dp[N])
    
