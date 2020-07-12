a, b = map(int, input().split())
while(b!=0):
    tmp = a % b
    a = b
    b = tmp
print( a * '1' )