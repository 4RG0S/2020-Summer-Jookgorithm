T = int(input())
for i in range(T):
    N = int(input())
    zero, one = 0, 0
    if( N == 0 ):
        print( 1, 0 )
    elif( N == 1 ):
        print( 0, 1 )
    elif( N == 2 ):
        print( 1, 1 )
    elif( N == 3 ):
        print( 1, 2 )
    else:
        form, latt = [ 1 , 1 ], [ 1 , 2 ]
        for i in range(4,N+1):
            result = [x+y for x,y in zip(form,latt)]
            form = latt
            latt = result
        print( result[0], result[1] )