import re

n = int(input())
number = list()
for i in range(n):
    for j in list(re.split("\\D", input())):
        if j != '':
            number.append(int(j))

number.sort()
print(*number, sep='\n')