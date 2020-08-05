#BOJ 9012

n=int(input())
for _ in range(n):
    text=list(input())
    arr=[]
    for element in text:
        if element=="(":
            arr.append(element)
        elif element==")":
            if len(arr)==0:
                arr.append(element)
                break
            else:
                arr.pop()
    if len(arr)>0:
        print("NO")
    else:
        print("YES")
