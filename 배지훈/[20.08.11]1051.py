n, m = list(map(int, input().split(' ')))
arr = [list(map(int, list(input()))) for _ in range(n)]
check = [[0 for _ in range(m)] for _ in range(n)]

for i in range(n):
    for j in range(m):
        y = i + 1
        x = j + 1
        cnt = 1
        while y < n and x < m:
            if arr[i][j] == arr[y][j] and arr[y][j] == arr[y][x] and arr[y][x] == arr[i][x]:
                cnt = x - j + 1

            x += 1
            y += 1

        check[i][j] = cnt ** 2

max_v = 0
for a in range(n):
    r_max = max(check[a])
    max_v = max(r_max, max_v)

print(max_v)