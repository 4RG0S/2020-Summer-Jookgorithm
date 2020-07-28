#include <stdio.h>
#include <string.h>

typedef struct stack
{
    int arr[100];
    int top;
} Stack;

void stackSet(Stack *s) {
    s->top = -1;
}

void push(Stack *s, int token) {
    s->arr[++(s->top)] = token;
}

int pop(Stack *s) {
    return s->arr[(s->top)--];
}

int main(){
    char postfix[100];
    Stack stack;

    stackSet(&stack);
    scanf("%s", postfix);

    for (int i = 0; i < strlen(postfix); i++) {
        if (postfix[i] >= 48 && postfix[i] <= 57) {
            push(&stack, postfix[i]-'0');
        }
        else {
            int op2 = pop(&stack);
            int op1 = pop(&stack);
            switch (postfix[i]) {
                case '+':
                    push(&stack, op1+op2);
                    break;
                case '-':
                    push(&stack, op1-op2);
                    break;
                case '*':
                    push(&stack, op1*op2);
                    break;
                case '/':
                    push(&stack, op1/op2);
                    break;
            }
        }
    }

    printf("%d", pop(&stack));
    return 0;
}