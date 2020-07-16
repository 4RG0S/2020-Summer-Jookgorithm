fromBase, toBase = map(int, input().split())
pos = int(input())
fromNum = list(map(int, input().split()))
base10 = 0

for i in range(pos):
    base10 += fromBase ** (pos - i - 1) * fromNum[i]

result = []
while base10:
    result.insert(0, base10 % toBase)
    base10 //= toBase

print(' '.join(map(str, result)))
