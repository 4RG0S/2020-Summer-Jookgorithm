while(True):
    a = int(input())
    l = list()
    if( a == 0 ):
        break
    else:
        for i in range(a):
            l.append(input())
        print(sorted( l , key = lambda x: x.lower())[0])