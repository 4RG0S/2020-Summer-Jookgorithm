N = int(input())
a = map(int,input().split())
b = map(int,input().split())
a = sorted( a )
b = sorted( b , reverse = True )
sum = 0
for i in range(N):
    sum += a[i] * b[i]
print( sum )