a = [0]
for i in range(1,46):
    for j in range(i):
        a.append(i)
A, B = map(int, input().split())
s = 0
for i in range( A, B+1 ):
    s += a[i]
print( s )