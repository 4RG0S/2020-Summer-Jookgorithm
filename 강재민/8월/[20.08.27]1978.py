import sys
input=sys.stdin.readline

def isPrime(n):
    if( n == 1 ):
        return False
    i = 2
    while( i*i <= n ):
        if( n % i == 0 ):
            return False
        i += 1
    return True
N = int(input())
l = list( map(int, input().split()))
c = 0
for i in l:
    if(isPrime(i)):
        c += 1
print( c ) 