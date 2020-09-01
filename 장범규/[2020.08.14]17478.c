#include <stdio.h>

int N;
char *str1 = "\"재귀함수가 뭔가요?\"\n";
char *str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
char *str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
char *str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
char *str5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
char *str6 = "라고 답변하였지.\n";

void rec(int n){
    if (n < N) {
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str1);
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str2);
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str3);
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str4);
    }
    else {
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str1);
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str5);
        for (int i = 0; i < n; i++) {
            printf("____");
        }
        printf("%s", str6);
        return;
    }
    
    rec(n+1);
    
    for (int i = 0; i < n; i++) {
        printf("____");
    }
    printf("%s", str6);
}

int main(){
    char *intro = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
    
    scanf("%d", &N);
    
    printf("%s", intro);
    rec(0);
    
    return 0;
}