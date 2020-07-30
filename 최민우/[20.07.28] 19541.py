import sys
input = sys.stdin.readline

n, m = map(int, input().split())
history = [list(map(int, input().split())) for _ in range(m)]
last_dna = list(map(int, input().split()))
expected_dna = last_dna[:]

for i in range(m - 1, -1, -1):
    if sum(expected_dna[x - 1] for x in history[i][1:]) != history[i][0]:
        for index in history[i][1:]:
            expected_dna[index - 1] = 0

result_dna = expected_dna[:]

"""
check:  result_dna == last_dna
"""

for i in range(m):
    if sum(result_dna[x - 1] for x in history[i][1:]):
        for index in history[i][1:]:
            result_dna[index - 1] = 1

if last_dna == result_dna:
    print('YES')
    print(' '.join(map(str, expected_dna)))
else:
    print('NO')
