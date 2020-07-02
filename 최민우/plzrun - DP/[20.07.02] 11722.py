N = int(input())
A = list(map(int, input().split()))
DP = [1 for _ in range(N)]

for i in range(N):
    max_list = [0]
    for j in range(0, i):
        if A[j] > A[i]:
            max_list.append(DP[j])
    DP[i] += max(max_list)
print(max(DP))
