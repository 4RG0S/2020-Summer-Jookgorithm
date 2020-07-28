def gcd( a, b ):
    while(b!=0):
        tmp = a % b
        a = b
        b = tmp
    return a

num1, den1 = map(int, input().split()) 
num2, den2 = map(int, input().split()) 

num3 = num1*den2 + num2*den1
den3 = den1*den2
d = gcd(num3,den3)
if( d == 1 ):
    print(num3,den3)
else:
    print(num3//d, den3//d)
