#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct stack
{
    int arr[51];
    int top;
} Stack;

void stackSet(Stack *s) {
    s->top = -1;
}

void push(Stack *s, char value) {
    s->arr[++(s->top)] = value;
}

char pop(Stack *s) {
    return s->arr[(s->top)--];
}

int check(char *str) {
    int len = strlen(str);
    Stack stack;
    
    stackSet(&stack);

    for (int i = 0; i < len; i++) {
        if (str[i] == '(') {
            push(&stack, str[i]);
        }
        else {
            if (stack.top == -1) {
                return 0;
            }
            else {
                pop(&stack);
            }
        }
    }

    if (stack.top == -1) {
        return 1;
    }
    else {
        return 0;
    }
}

int main(){
    int N;
    char str[51];

    scanf("%d", &N);
    
    for (int i = 0; i < N; i++) {        
        scanf("%s", str);
        
        if (check(str) == 1) {
            printf("YES\n");
        }
        else {
            printf("NO\n");
        }
    }

    return 0;
}