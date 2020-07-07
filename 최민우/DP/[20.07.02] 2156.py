n = int(input())
a = [int(input()) for _ in range(n)]
dp = [0 for _ in range(n)]
dp[0] = a[0]

"""
진짜 너무 어려워서 구상하는데만 시간이 엄청 걸렸다
3잔을 연속으로 마실 수는 없다 <<< 어렵게 느껴진 부분
위의 조건에 따라 3가지의 경우의 수를 따라야 한다는것은 알았다
#1 이번에 안마시기          -> 1칸 앞의 최대 와인
#2 이번에 마시기 (처음)     -> 2칸 앞의 최대 와인 + 현재 마시는 와인의 값
#3 이번에 마시기 (마지막)    -> 3칸 앞의 최대 와인 + 현재 마시는 와인의 값 + 바로 전에 마신 와인의 값
3가지의 경우의 수중 가장 높은 값이 DP 배열에 들어간다.

인덱스가 0, 1 그리고 2일 때에는 #3의 -3을 할 수 없다. <<< 새로운 문제점
인덱스를 3부터 시작한다
예외: 3잔 이하 (최대 2잔)일경우 그냥 다 마신다
"""

if n <= 2:
    print(sum(a))
else:
    # n >= 3
    dp[1] = a[0] + a[1]
    dp[2] = max(dp[1], a[0] + a[2], a[1] + a[2])
    for index in range(3, n):
        case_1 = dp[index - 1]
        case_2 = dp[index - 2] + a[index]
        case_3 = dp[index - 3] + a[index] + a[index - 1]
        dp[index] = max(case_1, case_2, case_3)
    print(max(dp))
