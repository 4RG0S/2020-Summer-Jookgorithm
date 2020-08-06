import sys
input=sys.stdin.readline

N = int(input())
l = list()
for i in range(N):
    inp = input().split()
    former = int(inp[0])
    letter = inp[1]
    l.append((former,letter))
for i in sorted( l, key = lambda x : x[0]):
    print(i[0],i[1])