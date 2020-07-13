a = input()
a =  ( 3 - len(a) % 3 ) * '0' + a
b = ''
i = 0
while( i < len(a) ):
    b = b + str(int(a[i]) * 4 + int(a[i+1]) * 2 + int(a[i+2]))
    i = i + 3
if(b[0] == '0'):
    print(b[1:])
else:
    print(b)