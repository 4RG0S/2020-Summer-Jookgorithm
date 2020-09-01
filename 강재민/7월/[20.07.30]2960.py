N, K = map(int,input().split())
l = list()
for i in range(2, N+1):
    l.append(i)
a = 2
result = 1
target = 2
prime = list()
while( l ):
    if( target > N ):
        a = min(l)
        target = a
        prime.append(a)
    if( target in l ):
        if( result == K ):
            print(target)
            break
        l.remove(target)
        result += 1
    target += a
print(prime)