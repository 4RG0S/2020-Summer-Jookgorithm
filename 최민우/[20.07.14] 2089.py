num = int(input())
if not num:
    print('0')
else:
    result = ''
    while num:
        if num % (-2):
            result = '1' + result
            num = num // -2 + 1
        else:
            result = '0' + result
            num //= -2
    print(result)
