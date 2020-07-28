#BOJ 2579

n = int(input())
p = [int(input()) for _ in range(n)]
if n <= 2: print(sum(p))
else:
    m={0: p[0], 1: p[0]+p[1], 2: max(p[0],p[1])+p[2]}
    for i in range(3, n): m[i] = p[i] + max(m[i-2], p[i-1]+m[i-3])
    print(m[n-1])
