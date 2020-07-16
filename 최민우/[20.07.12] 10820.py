import sys

while True:
    line = sys.stdin.readline().rstrip('\n')
    if not line:
        break
    result = [0, 0, 0, 0]
    for c in line:
        value = c.islower(), c.isupper(), c.isdigit(), c == ' '
        for i in range(len(result)):
            result[i] += value[i]
    print(' '.join(map(str, result)))
