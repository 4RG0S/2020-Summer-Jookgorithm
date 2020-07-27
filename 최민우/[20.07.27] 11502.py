n = 1000
field = [False, False] + [True] * (n - 1)
primes = []

for i in range(2, n + 1):
    if field[i]:
        primes.append(i)
        for j in range(2 * i, n + 1, i):
            field[j] = False


def solve(num):
    for x in primes:
        for y in primes:
            for z in primes:
                if x + y + z == num:
                    return "%d %d %d" % (x, y, z)


for _ in range(int(input())):
    print(solve(int(input())))
