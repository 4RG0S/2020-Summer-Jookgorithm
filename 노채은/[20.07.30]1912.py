#BOJ 1912

n = int(input())
seq = list(map(int, input().split()))
l = 0
m = max(seq)
for i in seq :
    if l+i >= 0 :
        l += i
        m = max(m, l)
    else :
        l = 0
print(m)
