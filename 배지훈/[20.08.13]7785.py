import sys
input = sys.stdin.readline
n = int(input())
peoples = set()
for i in range(n):
    name, status = input().split()
    if status[0] == 'e':
        peoples.add(name)
    else:
        peoples.remove(name)

print('\n'.join(sorted(list(peoples), reverse=True)))