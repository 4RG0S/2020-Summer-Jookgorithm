import sys
read = lambda :sys.stdin.readline().strip()
from collections import deque
import copy
from collections import defaultdict
import itertools
import math

def dfs(li,num,lis):
    if num==m:
        print(li)
        return

    for idx,i in enumerate(lis):

        dfs(li+' '+str(i),num+1,lis[idx:])


n,m = map(int,read().split())
mat = list(map(int,read().split()))
mat.sort()

for idx,value in enumerate(mat):
    dfs(str(value),1,mat[idx:])