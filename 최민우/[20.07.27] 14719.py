garbage, w = map(int, input().split())

h = list(map(int, input().split()))
result = 0
for height in range(max(h), 0 - 1, -1):
    flag = False
    count = 0
    for block in h:
        if block >= height:
            result += count
            count = 0
            flag = True
        elif flag:
            count += 1

print(result)