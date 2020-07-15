path = input('Path\t: ')
fp = open(path, 'r', encoding='utf8')

# 요일 감지
for line in fp.read().split('\n'):
    pass

#

fp.close()