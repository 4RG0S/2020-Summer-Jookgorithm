a, b = map(int, input().split())
ta , tb = a, b
while(b!=0):
    tmp = a % b
    a = b
    b = tmp
print( a )
print( a * ta // a * tb // a )