#BOJ 9465

T=int(input())

for i in range(T):
	n=int(input())
	arr=[] #2xn
	arr.append(list(map(int, input().split())))
	arr.append(list(map(int, input().split())))
	
	arr[0][1] = arr[0][1] + arr[1][0]
	arr[1][1] = arr[1][1] + arr[0][0]
	
	for j in range(2,n):
		arr[0][j] += max(arr[1][j-1], arr[1][j-2])
		arr[1][j] += max(arr[0][j-1], arr[0][j-2])
	print(max(arr[0][n-1], arr[1][n-1]))
