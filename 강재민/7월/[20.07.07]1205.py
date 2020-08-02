def main():
    N, score, P = list(map(int,input().split()))
    if( N == 0 ):
        print( 1 )
    else:
        score_list = list(map(int,input().split()))
        score_list.sort(reverse=True)
        score_list = score_list[:P]
        rank = 1
        if( len(score_list) == P ) and ( score_list[-1] >= score):
            print(-1)
            return
            
        for i, v in enumerate(score_list):

            if( v == score ):               #점수가 같은데
                if( i == (P - 1) ):         #index가 마지막이라면
                    print(-1)               #랭크를 매길수 없음
                    return
                else:
                    print(rank)
                    return

            elif( v > score ):
                rank = rank + 1
            elif( v < score ):
                print(rank)
                return
        if( len(score_list) < P ):
            print(rank)
        else:
            print(-1)
       

if __name__ == "__main__":
    main()