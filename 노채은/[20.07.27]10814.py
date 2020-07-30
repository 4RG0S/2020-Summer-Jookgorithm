#BOJ 10814

N = int(input())
list = []
for i in range(N) :
    age, name = input().split()
    list.append([int(age), i+1, name])

list.sort()
for age, rank, name in list :
    print(age, name)
