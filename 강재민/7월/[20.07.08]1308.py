def isleap( year ):
    flag = False
    if( (year % 4) == 0): flag = True
    if( (year % 100) == 0 ): flag = False
    if( (year % 400) == 0 ): flag = True
    return flag

def days( y , m , d):
    result = 0
    mon = [ 0, 31, 28, 31, 30 ,31 ,30 ,31, 31, 30 ,31, 30 ,31 ]
    for i in range(1 , y):
        result = result + 365
        if( isleap( i ) ):
            result = result + 1
    for i in range( 1, m ):
        if( isleap( y ) ) and  i == 2:
            result = result + mon[i] + 1
        else:
            result = result + mon[i]
    return result + d
        
y1, m1, d1 = list(map(int,input().split()))
y2, m2, d2 = list(map(int,input().split()))
if( y2 - y1 ) >= 1000 and ( days(4,m1,d1) <= days( 4, m2,d2 ) ):
    print('gg')
else:
    print('D-'+str(days( y2,m2 ,d2) - days( y1, m1, d1)))
