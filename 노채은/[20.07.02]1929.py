#BOJ 1929

import math

def onlynum(a) :
    if a == 1 :
        return False
    else :
        N = int(math.sqrt(a))
        for i in range(2, N+1) :
            if a % i == 0 :
                return False
        return True
            
M, N = map(int, input().split())
for i in range(M, N+1) :
    if onlynum(i) :
        print(i)
    
