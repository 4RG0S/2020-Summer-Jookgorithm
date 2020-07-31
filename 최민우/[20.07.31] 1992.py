def cut(num, x, y):
    global field, result
    symbol = field[y][x]
    if num == 1:
        result[symbol] += 1
        return
    dirs = [(i, j) for i in range(num) for j in range(num)]
    flag = True
    for dx, dy in dirs:
        if field[y + dy][x + dx] != symbol:
            flag = False
            break
    if flag:
        result[symbol] += 1
        return
    delta = num // 2
    dirs = [(i * delta, j * delta) for i in range(3) for j in range(3)]
    for new_x, new_y in dirs:
        cut(delta, x + new_x, y + new_y)
    return


m = int(input())
field = [list(map(int, input().split())) for _ in range(m)]
result = [0, 0, 0]  # 0, 1, -1

cut(m, 0, 0)
result.insert(0, result.pop())
print('\n'.join(map(str, result)))