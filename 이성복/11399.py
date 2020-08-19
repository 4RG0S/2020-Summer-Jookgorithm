N = int(input())

a = list(map(int, input().split()))
b = list()

for i in range(len(a)):
    b.append((a[i], i + 1))

b.sort(key=lambda x : (x[0]))

result = 0
tmp = 0
for i in b:
    tmp += i[0]
    result += tmp

print(result)