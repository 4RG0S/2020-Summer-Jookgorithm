A, B, N  = input().split()
A = int(A)
B = int(B)
N = int(N)

quot = A // B
remainder = ( A % B )
for i in range(N):
    remainder =  (remainder % B ) * 10
    quot = remainder // B
print( quot )