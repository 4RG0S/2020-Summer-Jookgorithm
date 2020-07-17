def classOf(num, div):
    cnt = 0
    while num:
        num //= div
        cnt += num
    return cnt


n, r = map(int, input().split())
five = classOf(n, 5) - (classOf(n - r, 5) + classOf(r, 5))
two = classOf(n, 2) - (classOf(n - r, 2) + classOf(r, 2))
print(min(five, two))

# n! / {(n-r)! r!}
# n * n - 1 * ... * n - r + 1 / r!
# 10 = 2 * 5
# n!.2 n!.5 / ...
