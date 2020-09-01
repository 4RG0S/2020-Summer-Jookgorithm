#BOJ 9461

m = [0 for i in range(101)]
m[1] = 1
m[2] = 1
m[3] = 1

for i in range(0, 98) :
    m[i+3] = m[i] + m[i+1]

n = int(input())
for i in range(n) :
    n = int(input())
    print(m[n])
