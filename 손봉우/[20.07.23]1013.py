#1013(s1) regex!
import re

t = int(input())
p = re.compile("(100+1+|01)+")
for i in range(t):
    code = input();
    r = p.fullmatch(code)
    if str(r) == 'None':
        print("NO")
    else:
        print("YES")
    
