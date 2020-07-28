N = int(input())
l = list()
for i in range(N):
    l.append(input())

l = sorted(l, key=lambda x: len(x),reverse=True)
sl = set()
for i in l:
    if( len(sl) == 0 ):
        sl.add(i)
        continue
    temp = sl.copy()
    Flag = True
    for j in temp:
        if i == j[:len(i)]:
            Flag = False
            break
    if( Flag ):
        sl.add(i)
print(len(sl))