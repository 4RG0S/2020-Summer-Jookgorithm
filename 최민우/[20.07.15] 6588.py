def _6588(num):
    for i in sosu:
        if array[num - i] == 1:
            return "%d = %d + %d" % (num, i, num - i)


# 입력
inputs = []
while True:
    a = int(input())
    if not a:
        break
    inputs.append(a)

max_value = max(inputs)

# 체로 거름
array = [True for i in range(max_value + 1)]
sosu = []

i = 2
while i < len(array):
    if array[i]:
        sosu.append(i)
        for j in range(i + i, max_value + 1, i):
            array[j] = False
    i += 1

for x in inputs:
    print(_6588(x))
