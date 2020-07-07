input_val = input().split(' ')
input_e = int(input_val[0])
input_s = int(input_val[1])
input_m = int(input_val[2])
e, s, m, year = 0, 0, 0, 0

while True:
    if e == 15:
        e = 1
    else:
        e += 1

    if s == 28:
        s = 1
    else:
        s += 1

    if m == 19:
        m = 1
    else:
        m += 1

    year += 1
    if input_e == e and input_s == s and input_m == m:
        break

print(year)