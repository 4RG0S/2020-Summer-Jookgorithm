#BOJ 11652

n=int(input())
num={}
for i in range(n):
    k=int(input())
    if k in num.keys():
        num[k]+=1
    else:
        num.setdefault(k, 1)

max_v=0
max_k=0
for k,v in num.items():
    if v>max_v:
        max_v=v
        max_k=k
    elif v==max_v:
        max_k=min((max_k, k))

print(max_k)
