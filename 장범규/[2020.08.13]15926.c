#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct stack
{
    int arr[200001];
    int top;
} Stack;

void stackSet(Stack *s) {
    s->top = -1;
}

void push(Stack *s, int value) {
    s->arr[++(s->top)] = value;
}

int pop(Stack *s) {
    return s->arr[(s->top)--];
}

int check(char *str, int len) {
    int size = 0, tmp = 0, d[200001];
    Stack stack;
    
    stackSet(&stack);

    for (int i = 0; i < len; i++) {
        if (str[i] == '(') {
            push(&stack, i);
        }
        else {
            if (stack.top != -1) {
                d[i] = 1;
                d[stack.arr[stack.top]] = 1;
                pop(&stack); 
            }
        }
    }

    for (int i = 0; i < len; i++) {
        if (d[i] == 1) {
            tmp++;
            size = size > tmp ? size : tmp;
        }
        else {
            tmp = 0;
        }
    }

    return size;
}

int main(){
    int len;
    char *str;

    scanf("%d", &len);
    
    str = malloc(sizeof(char)*len);

    scanf("%s", str);

    printf("%d", check(str, len));

    free(str);

    return 0;
}