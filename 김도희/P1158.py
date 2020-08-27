import queue

N, K = map(int, input().split()) #명수와 몇 번째를 입력받음
que = queue.Queue() #큐 생성

for i in range(N):
    que.put(i+1)

print("<", end='')

while que:
    if que.qsize() <= 1:
        print(que.get(), end='>')
        break;

    for i in range(K - 1):
        temp = que.get()
        que.put(temp)

    print(que.get(), end=', ')

