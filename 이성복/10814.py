name = list()
for i in range(int(input())):
    tmp = list(input().split())
    tmp[0] = int(tmp[0])
    name.append(tmp)

name.sort(key=lambda x : x[0])

for info in name:
    print(info[0], info[1])