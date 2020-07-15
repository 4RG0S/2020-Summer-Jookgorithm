alpha = {}
for i in range(97, 122 + 1):
    alpha[chr(i)] = 0
line = list(input())

for c in line:
    alpha[c] += 1

for i in range(97, 122 + 1):
    print(alpha[chr(i)], end=' ')
