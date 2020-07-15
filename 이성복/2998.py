binary = input()

length = len(binary)

eight_dict = {'000' : '0', '001' : '1', '010' : '2', '011' : '3', '100' : '4', '101' : '5', '110' : '6', '111' : '7'}
while length % 3 != 0:
    binary = '0' + binary
    length += 1

result = ''
for number in range(0, length, 3):
    result = result + eight_dict[binary[number:number+3]]
print(result)