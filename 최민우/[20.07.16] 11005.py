base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

n, b = map(int, input().split())
result = ''

while n != 0:
    result += str(base[n % b])
    n //= b

print(result[::-1])
