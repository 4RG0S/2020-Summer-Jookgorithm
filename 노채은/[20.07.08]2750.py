#BOJ 2750

a=int(input())
b=set()
for c in range(a):
    b.add(int(input()))
b=list(b)
b.sort()
for c in range(len(b)):
    print(b[c])
