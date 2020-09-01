from itertools import combinations

nanJE = [int(input()) for _ in range(9)]
for k in combinations(nanJE, 7):
    if sum(k) == 100:
        print('\n'.join(map(str, sorted(k))))
        break
