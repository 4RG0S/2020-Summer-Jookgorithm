#include <stdio.h>

int N;
char *str1 = "\"����Լ��� ������?\"\n";
char *str2 = "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n";
char *str3 = "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n";
char *str4 = "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n";
char *str5 = "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n";
char *str6 = "��� �亯�Ͽ���.\n";

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
    char *intro = "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n";
    
    scanf("%d", &N);
    
    printf("%s", intro);
    rec(0);
    
    return 0;
}