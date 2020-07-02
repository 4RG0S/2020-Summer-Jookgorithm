switch_num = int(input())
switch = list(map(int, input().split(' ')))
people_num = int(input())
switch.insert(0, -1)

for i in range(people_num):
    cmd = list(map(int, input().split(' ')))
    gender = cmd[0]
    received_num = cmd[1]
    if gender == 1:
        turn_val = received_num
        while switch_num >= turn_val:
            if switch[turn_val] == 0:
                switch[turn_val] = 1
            else:
                switch[turn_val] = 0

            turn_val += received_num
    elif gender == 2:
        check_max_term = min(received_num - 1, switch_num - received_num)
        check_term = 1

        while check_term <= check_max_term:
            if switch[received_num - check_term] != switch[received_num + check_term]:
                break

            check_term += 1

        check_term -= 1
        for j in range(received_num - check_term, received_num + check_term + 1):
            if switch[j] == 0:
                switch[j] = 1
            else:
                switch[j] = 0

print_cnt = 0
for x in range(1, switch_num + 1):
    if print_cnt == 20:
        print()
        print_cnt = 0

    print(switch[x], end=' ')
    print_cnt += 1