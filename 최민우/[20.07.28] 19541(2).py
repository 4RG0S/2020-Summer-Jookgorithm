import sys

input = sys.stdin.readline

n, m = map(int, input().split())
history = [list(map(int, input().split())) for _ in range(m)]
last_dna = list(map(int, input().split()))
expected_dna = last_dna[:]

for event in range(m - 1, -1, -1):
    flag = False
    for j in history[event][1:]:
        if not last_dna[j - 1]: flag = True
    if not flag: continue
    for j in history[event][1:]:
        expected_dna[j - 1] = 0

result_dna = expected_dna[:]

"""
check:  result_dna == last_dna
"""

for event in range(m):
    flag = False
    for j in history[event][1:]:
        if expected_dna[j - 1]: flag = True
    if not flag: continue
    for j in history[event][1:]:
        result_dna[j - 1] = 1

if last_dna == result_dna:
    print('YES')
    print(' '.join(map(str, expected_dna)))
else:
    print('NO')
