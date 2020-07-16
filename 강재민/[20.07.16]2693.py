T = int(input())
for i in range(T):
    a = sorted( map(int,input().split()) , reverse=True )
    print( a[2] )