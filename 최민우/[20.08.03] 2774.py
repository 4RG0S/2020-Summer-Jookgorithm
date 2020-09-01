line = list('0123456789')
for _ in range(int(input())):
    result = 0
    var = input()
    for char in line:
        result += char in var
    print(result)
