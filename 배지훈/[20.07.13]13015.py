n = int(input())
line_n = 2 * (n-1) + 1
print_n = line_n - 2 + (n * 2)
for i in range(line_n):
    if i == 0 or i == line_n - 1:
        for j in range(print_n):
            if j < n or j >= print_n - n:
                print('*', end = '')
            else:
                print(end=' ')

    elif i == n - 1:
        for j in range(n-1):
            print(end=' ')

        print('*', end='')
        for j in range(n-2):
            print(end=' ')

        print('*', end='')
        for j in range(n-2):
            print(end=' ')

        print('*', end ='')

    else:
        for j in range((n-1) - abs(n-1-i)):
            print(end=' ')

        print('*', end='')
        for j in range(n-2):
            print(end=' ')

        print('*', end='')
        for j in range((2 * abs(n-i-1)) - 1):
            print(end=' ')

        print('*', end='')
        for j in range(n-2):
            print(end=' ')

        print('*', end='')

    print()