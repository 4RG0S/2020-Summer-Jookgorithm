from itertools import combinations
from math import gcd

for _ in range(int(input())):
    input_list = list(map(int, input().split()))
    result = 0
    for a, b in list(combinations(input_list[1:], 2)):
        result += gcd(a, b)
    print(result)
