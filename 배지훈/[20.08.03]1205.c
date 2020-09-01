//#include <stdio.h>
//
//int main() {
//    int i,tmp,n,score,p,rank=1,same_score_rank=1;
//
//    scanf("%d%d%d", &n, &score, &p);
//
//    for(i=0; i < n; ++i) {
//        scanf("%d", &tmp);
//        if(tmp > score)
//            ++rank;
//        if(tmp >= score) {
//            ++same_score_rank;
//        }
//    }
//
//    if(rank > p)
//        printf("-1");
//    else if(same_score_rank > p)
//        printf("-1");
//    else
//        printf("%d", rank);
//}