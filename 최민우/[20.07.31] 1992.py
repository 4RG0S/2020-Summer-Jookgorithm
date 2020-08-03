def cut(num, x, y):
    global field
    symbol = field[y][x]
    if num == 1:
        return symbol
    dirs = [(i, j) for i in range(num) for j in range(num)]

    flag = True
    for dx, dy in dirs:
        if field[y + dy][x + dx] != symbol:
            flag = False
            break
    if flag:
        return symbol
    delta = num // 2
    dirs = [(i * delta, j * delta) for j in range(2) for i in range(2)]
    return_value = "("
    for new_x, new_y in dirs:
        return_value += cut(delta, x + new_x, y + new_y)
    return return_value + ")"


n = int(input())
field = [list(input()) for _ in range(n)]

print(cut(n, 0, 0))
