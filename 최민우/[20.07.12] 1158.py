n, k = map(int, input().split())
person = [i for i in range(1, n + 1)]
result = []
i = k - 1
while True:
    result.append(person.pop(i))
    if not person:
        break
    i = (i + k - 1) % len(person)

print('<' + ', '.join(map(str, result)) + '>')
