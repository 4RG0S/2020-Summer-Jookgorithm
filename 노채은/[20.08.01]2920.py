#BOJ 2920

arr = list(map(int,input().split()))
ans = list(reversed(sorted(arr)))

if (arr == sorted(arr) ) :
    print("ascending")
elif (arr == ans):
    print("descending")
else:
    print("mixed")

