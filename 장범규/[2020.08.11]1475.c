#include <stdio.h>
#include <string.h>

int main(){
    char str[10];
    int com, num, arr[10] = {0};

    scanf("%s", str);

    for (int i = 0; i < strlen(str); i++) {
        arr[str[i] - '0']++;
    }

    num = 0;
    for (int i = 0; i < 10; i++) {
        if ((i != 9 && i != 6) && num < arr[i]) {
            num = arr[i];
        }
    }
    
    com = (arr[6]+arr[9]+1)/2;
    num = num >= com ? num : com;
    
    printf("%d", num);
    
    return 0;
}