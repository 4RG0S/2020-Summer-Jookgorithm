doc = input()
txt = input()
cnt = 0
if not (txt in doc):
    print(cnt)
else:
    while(txt in doc):
        doc = doc[ doc.find(txt) + len(txt) : ]
        cnt += 1
    print(cnt)