from math import gcd


def lcm(x, y):
    return x * y // gcd(x, y)


for i in range(int(input())):
    a, b = map(int, input().split())
    print(lcm(a, b))