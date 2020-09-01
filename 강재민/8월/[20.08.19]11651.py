import sys
input=sys.stdin.readline
N = int(input())
inp = []
for i in range(N):
    a = input().split()
    form = int(a[0])
    let = int(a[1])
    inp.append( (form, let) )
for i in sorted(inp, key = lambda x : (x[1], x[0])):
    print( i[0], i[1] )