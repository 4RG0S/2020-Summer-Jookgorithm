from collections import Counter
import sys

card = []
for _ in range(int(sys.stdin.readline().rstrip())):
    card.append(sys.stdin.readline().rstrip())
card = Counter(card)

count = card.most_common()[0][1]
result = []
for i in card.most_common():
    if i[1] is not count:
        break
    result.append(int(i[0]))
print(sorted(result)[0])
