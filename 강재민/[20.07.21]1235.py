N = int(input())
num = list()
for i in range(N):
    num.append(input())

for j in range(1,len(num[0])+1):
    a = set()
    for k in num:
        a.add( k[ -1 * j : ] )
    if  ( len(a) == len(num) ):
        print(j)
        break


