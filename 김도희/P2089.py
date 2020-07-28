n = int(input())
base = 1
binary = []

if n == 0:
    print(0)
else:
    while n:
        if n % 2:
            binary.append(1)
            n = n - base
        else:
            binary.append(0)
        base = base * (-1)
        n //= 2
        #나누기 연산 후 소수점 이하의 수를 버리고 정수 부분 수만 구함

for i in range(len(binary)-1, -1, -1):
    print(binary[i], end='')
