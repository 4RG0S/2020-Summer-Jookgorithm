input_val = input().split()
n = int(input_val[0])
d = input_val[1]
cnt = 0
for i in range(1, n+1):
    val = str(i)
    for j in range(len(val)):
        if val[j] == d:
            cnt += 1

print(cnt)
