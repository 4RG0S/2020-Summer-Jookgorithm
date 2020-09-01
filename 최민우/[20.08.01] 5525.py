from collections import deque

N = int(input())
garbage = input()
queue = deque(list(input()))

p = queue.popleft()
ready = p == 'I'
stack = 0

result = 0
while queue:
    q = queue.popleft()
    if ready:
        if q != p:
            if p + q == 'OI':
                stack += 1
                if stack >= N:
                    stack = N
                    result += 1
        else:
            ready = (p == 'I')
            stack = 0

    elif q == 'I':
        ready = True
    p = q

print(result)