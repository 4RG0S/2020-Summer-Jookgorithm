"""
포도주 문제와 비슷한 문제이다
이번에는 Top-down 형식으로 문제풀이를 할것이다
"""

n = int(input())
s = [int(input()) for _ in range(n)]
dp = [-1 for _ in range(n)]


def getDP(index):
    """
    case 1: 바로 전 계단 값 + 현재 값 + 3칸 전 DP
    case 2: 현재 값 + 2칸 전 DP
    dp[i] = max(case 1, case 2)
    """
    if dp[index] != -1:
        return dp[index]
    case_1 = getDP(index - 3) + s[index] + s[index - 1]
    case_2 = getDP(index - 2) + s[index]
    dp[index] = max(case_1, case_2)
    return dp[index]


if n <= 2:
    print(sum(s))
else:
    dp[0] = s[0]
    dp[1] = s[0] + s[1]
    dp[2] = s[2] + max(0, s[0], s[1])
    print(getDP(n - 1))
