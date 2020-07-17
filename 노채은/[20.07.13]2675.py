#BOJ 2675

n = int(input())

for i in range(n):
    a,b = input().split()
    a = int(a)
    s= ''
 
    for j in b:
        s = s + a*j
    print(s)
