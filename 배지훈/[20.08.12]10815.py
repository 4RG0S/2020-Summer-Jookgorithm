n = int(input())
card = list(map(int, input().split(' ')))
m = int(input())
targets = list(map(int, input().split(' ')))
card.sort(reverse=False)
for i in range(m):
    l, r = 0, n-1
    cur = int((l + r) / 2)
    target = targets[i]
    flag = False

    while True:
        if card[cur] == target:
            flag = True
            break
        elif l >= r:
            break
        elif card[cur] < target:
            l = cur + 1
        else:
            r = cur - 1

        cur = int((l + r) / 2)

    if flag:
        print('1 ', end='')
    else:
        print('0 ', end='')

