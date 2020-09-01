def fibo(n):
    if n == 1:
        return 1
    return n + fibo(n - 1)


garbage = input()
result = 0
for char in input().replace(' ', '').split('0'):
    if len(char):
        result += fibo(len(char))
print(result)
