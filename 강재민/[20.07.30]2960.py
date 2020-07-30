N, K = map(int,input().split())
l = list()
for i in range(2, N+1):
    l.append(i)
a = 2
result = 1
target = 2
while( l ):
    if( target > N ):
        a = min(l)
        target = a
    if( target in l ):
        if( result == K ):
            print(target)
            break
        l.remove(target)
        result += 1
    target += a
