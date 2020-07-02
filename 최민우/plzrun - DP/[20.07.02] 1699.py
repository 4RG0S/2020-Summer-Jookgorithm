# from pprint import pprint
#
# n = int(input())
# dp = [0 for _ in range(n + 1)]
#
#
# def getDP(index):
#     if dp[index] != -1:
#         return dp[index]
#     if index in squares:
#         dp[index] = 1
#         return dp[index]
#     for i in range(len(squares)):
#         if squares[i] > index:
#             dp[index] = getDP(index - squares[i - 1]) + 1
#             return dp[index]
#
#
# for i in range(1, n + 1):
#     getDP(i)
# print(dp[-1])
