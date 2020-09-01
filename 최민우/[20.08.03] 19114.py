"""
10%에서 시간초과 발생
좀 더 효율적인 알고리즘을 짤것.
"""

from itertools import combinations


def combI(amount):
    for k in combinations(friday, amount):
        if sum(k) == m:
            return True
    return False


n, m = map(int, input().split())
friday = list(map(int, input().split()))
flag = 0
for i in range(1, n + 1):
    if combI(i):
        flag = 1
        break
print(flag)
