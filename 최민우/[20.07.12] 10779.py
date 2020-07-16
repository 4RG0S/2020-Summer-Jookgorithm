line = list(input())
stair = 0

result = 0
for i in range(len(line)):
    if line[i] == ')':
        stair -= 1
        if line[i - 1] == '(':
            # Laser
            result -= 1
            result += stair
    else:
        stair += 1
        result += 1

print(result)
