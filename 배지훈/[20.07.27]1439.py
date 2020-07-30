input_val = input()
cnt = 0
for i in range(len(input_val)-1):
    if input_val[i] != input_val[i+1]:
        cnt += 1
print((cnt + 1) // 2)