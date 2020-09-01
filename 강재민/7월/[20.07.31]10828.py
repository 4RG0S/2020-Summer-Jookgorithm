import sys

input=sys.stdin.readline

N = int(input())
stack = list()
for i in range(N):
    inp = input()
    if( 'push' in inp ):
        stack.append( inp.split()[1] )
    elif( 'pop' in inp ):
        if( stack ):
            print(stack.pop())
        else:
            print(-1)
    elif( 'top' in inp ):
        if( stack ):
            print(stack[-1])
        else:
            print(-1)
    elif( 'size' in inp ):
        print(len(stack))
    elif( 'empty' in inp ):
        if( stack ):
            print(0)
        else:
            print(1)

