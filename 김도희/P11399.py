N = int(input())
nums = list(map(int, input().split()))

if N == 1:
    print(nums[0])
else:
    nums.sort()

    sum = 0
    minSum = 0

    for i in range(N):
        minSum += (sum + nums[i])
        sum += nums[i]

    print(minSum)