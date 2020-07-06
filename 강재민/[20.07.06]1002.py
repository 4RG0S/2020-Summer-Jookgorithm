import math

T = int( input() )
for i in range(T):
    input_list = input().split()
    j = ( int(input_list[0]), int(input_list[1]) )
    b = ( int(input_list[3]), int(input_list[4]) )
    r1 = int(input_list[2])
    r2 = int(input_list[5])

    distance =  math.sqrt( ( j[0] - b[0] )**2 + (j[1] - b[1] )**2 )
    if( j == b ) and r1 == r2:
        print( -1 )
    elif r1+distance > r2 and r2+distance > r1 and r1+r2 > distance:
        print( 2 ) 
    elif r1+distance == r2 or r2+distance == r1 or r1+r2 == distance:
        print( 1 )
    else:
        print( 0 )