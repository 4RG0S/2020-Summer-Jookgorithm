from collections import defaultdict

for i in range(int(input())):
    wear = defaultdict(list)
    for j in range(int(input())):
        c, s = map(str, input().split())
        wear[s].append(c)

    info = list(wear.keys())
    result = 1
    for item in info:
        result *= len(wear[item]) + 1
    print(result - 1)