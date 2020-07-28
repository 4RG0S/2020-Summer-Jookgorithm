def numberArray(fin, k):
    if k == N:
        print(' '.join(list(map(str, fin))))
    else:
        for i in range(1, N + 1):
            if i not in fin:
                numberArray(fin + [i], k + 1)


N = int(input())
numberArray([], 0)