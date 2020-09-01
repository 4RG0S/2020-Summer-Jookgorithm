from math import gcd

"""
일반적인 구현으로 풀이를 하였다
시간초과 x 3

일반적인 구현으로는 시간복잡도 O(N*M) 에 의해 1초가 넘어가는 것 같다
다른 접근법이 필요해보인다. . .

임의 -> x, y가 아닌
x -> y 찾기를 하면 된다!!
틀렸습니다 x 2
반례가 있나보다

풀었다...
반례 2개를 찾고 해결하였다
"""


def lcd(a, b):
    return a * b // gcd(a, b)


for _ in range(int(input())):
    M, N, x, y = map(int, input().split())
    max_value = lcd(N, M)
    var = x % (M + 1)
    tmp = x

    for i in range(N):
        ty = tmp % N if tmp % N else N
        if ty == y:
            break
        tmp = ty + M
        var += M

    print(-1 if var > max_value else var)
