def _2960(n, k):
    array = [i for i in range(2, n + 1)]
    count = 0
    while True:
        for p in range(array[0], array[-1] + 1, array[0]):
            if p in array:
                count += 1
                del array[array.index(p)]
                if count == k:
                    return p


N, K = map(int, input().split())

print(_2960(N, K))
