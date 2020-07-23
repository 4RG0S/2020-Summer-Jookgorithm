from collections import defaultdict
import sys

input = sys.stdin.readline

result = defaultdict(int)

for i in range(int(input())):
    name, status = input().split()
    if status == 'enter':
        result[name] = 1
    else:
        result[name] = 0

result = list(result.items())
result = [i[0] for i in result if i[1] == 1]
result.sort(reverse=True)
for item in result:
    print(item)