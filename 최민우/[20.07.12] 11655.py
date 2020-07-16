line = input()
for c in line:
    if ord('a') <= ord(c) <= ord('z'):
        num = ord(c) + 13
        if num > ord('z'):
            num -= 26
        print(chr(num), end='')
    elif ord('A') <= ord(c) <= ord('Z'):
        num = ord(c) + 13
        if num > ord('Z'):
            num -= 26
        print(chr(num), end='')
    else:
        print(c, end='')
