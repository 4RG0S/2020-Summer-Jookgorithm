from collections import Counter
import math

matter = input()
matter = matter.replace('6', '9')
number_count = Counter(matter)

result = number_count.most_common(2)
if len(result) == 1:
    if result[0][0] == '9':
        tmp = result[0][1]
        tmp = math.ceil(tmp / 2)
        print(tmp)
    else:
        print(result[0][1])
else:
    if result[0][0] == '9':
        tmp = result[0][1]
        tmp = math.ceil(tmp / 2)
        if tmp >= result[1][1]:
            print(tmp)
        else:
            print(result[1][1])
    else:
        print(result[0][1])
