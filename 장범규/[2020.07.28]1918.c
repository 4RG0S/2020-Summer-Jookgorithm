#include <stdio.h>
#include <string.h>

typedef struct stack
{
    char arr[100];
    int top;
} Stack;

void stackSet(Stack *s) {
    s->top = -1;
}

void push(Stack *s, char token) {
    s->arr[++(s->top)] = token;
}

char pop(Stack *s) {
    return s->arr[(s->top)--];
}

int getPriority(char token) {
    if (token == '+' || token == '-') {
        return 3;
    }
    else if (token == '*' || token == '/') {
        return 5;
    }
    else if (token == '(' || token == ')') {
        return 1;
    }
    else {
        return -1;
    }
}

int main(){
    char infix[101];
    Stack stack;

    stackSet(&stack);

    scanf("%s", infix);

    for (int i = 0; i < strlen(infix); i++) {
        if (infix[i] >= 65 && infix[i] <= 90) {
            printf("%c", infix[i]);
        }
        else if (infix[i] == '(') {
            push(&stack, infix[i]);
        }
        else if (infix[i] == ')') {
            while (stack.arr[stack.top] != '(') {
                printf("%c", pop(&stack));
            }
            pop(&stack);
        }
        else {
            while (getPriority(stack.arr[stack.top]) >= getPriority(infix[i])) {
                printf("%c", pop(&stack));
            }
            push(&stack, infix[i]);
        }
    }
    while (!(stack.top == -1)) {
        printf("%c", pop(&stack));
    }

    return 0;
}