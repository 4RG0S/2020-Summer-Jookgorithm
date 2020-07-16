people = []
for i in range(int(input())):
    line = input().split()
    name = line[0]
    kor, eng, math = map(int, line[1:])
    people.append({'name': name,
                   'kor': kor,
                   'eng': eng,
                   'math': math})
people.sort(key=lambda x: (-x['kor'], x['eng'], -x['math'], x['name']))
print('\n'.join(i['name'] for i in people))
