#include <stdio.h>
#include <string.h>

int main(){
    char str[150];
    int status;

    scanf("%s", str);

    status = 0;
    for (int i = 0; i < strlen(str); i++) {
        if (status == 0) {
            status = (str[i] == '1') ? 1 : 6;
            continue;
        }
        else if (status == 1) {
            status = (str[i] == '0') ? 2 : -1;
            continue;
        }
        else if (status == 2) {
            status = (str[i] == '0') ? 3 : -1;
            continue;
        }
        else if (status == 3) {
            status = (str[i] == '0') ? 3 : 4;
            continue;
        }
        else if (status == 4) {
            status = (str[i] == '1') ? 5 : 6;
            continue;
        }
        else if (status == 5) {
            status = (str[i] == '1') ? 5 : 7;
            continue;
        }
        else if (status == 6) {
            status = (str[i] == '1') ? 0 : -1;
            continue;
        }
        else if (status == 7) {
            status = (str[i] == '1') ? 0 : 7;
            continue;
        }
        else {
            break;
        }
    }

    if (status == 0 || status == 4 || status == 5) {
        printf("%s", "SUBMARINE");
    }
    else {
        printf("%s", "NOISE");
    }

    return 0;
}