#include <stdio.h>
#include <stdlib.h>

typedef struct result
{
    char *rearr;
    int idx;
} Result;

typedef struct stack
{
    int *arr;
    int top;
    int max;
} Stack;

void set(Stack *s, int n, Result *r) {
    s->arr = malloc(sizeof(Stack)*n);
    s->top = -1;
    r->rearr = malloc(sizeof(char)*n*2);
    r->idx = 0;
}

void push(Stack *s, int value, Result *r) {
    s->arr[++(s->top)] = value;
    r->rearr[(r->idx)++] = '+';
}

int pop(Stack *s, Result *r) {
    s->arr[(s->top)--];
    r->rearr[(r->idx)++] = '-';
}

int main(){
    int n, input;
    Stack stack;
    Result result;

    scanf("%d", &n);

    set(&stack, n, &result);

    for (int i = 0; i < n; i++) {
        fgetc(stdin);
        scanf("%d", &input);
        if (i == 0) {
            stack.max = input;
            for (int j = 1; j <= input; j++) {
                push(&stack, j, &result);
            }
            pop(&stack, &result);
        }
        else {
            if (stack.max < input) {
                for (int j = stack.max+1; j <= input; j++) {
                    push(&stack, j, &result);
                }
                pop(&stack, &result);
                stack.max = input;
            }
            else {
                if (stack.arr[stack.top] != input) {
                    printf("NO");
                    return 0;
                }
                else {
                    pop(&stack, &result);
                }
            }
        }
    }
    for (int i = 0; i < n*2; i++) {
        printf("%c\n", result.rearr[i]);
    }
    return 0;
}