import sys
input=sys.stdin.readline
T = int(input())
FLAG = "YES"
for i in range(T):
    stack = list()
    for j in input():
        if( j == '('):
            stack.append('(')
        elif( j == ')'):
            if( len(stack) == 0 ):
                FLAG = "NO"
                break
            else:
                stack.pop()
    if( len(stack) == 0 ):
        print(FLAG)
        FLAG = "YES"
    else:
        print("NO")