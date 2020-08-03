#include <stdio.h>
#include <stdlib.h>

typedef struct stack
{
    int *arr;
    int top;
} Stack;

void stackSet(Stack *s, int N) {
    s->arr = malloc(sizeof(int)*N);
    s->top = -1;
}

void push(Stack *s, int value) {
    s->arr[++(s->top)] = value;
}

int pop(Stack *s) {
    return s->arr[(s->top)--];
}

int size(Stack *s) {
    return s->top+1;
}

int main(){
    int N, input;
    long long sum;
    Stack stack;

    scanf("%d", &N);
    stackSet(&stack, N);

    for (int i = 0; i < N; i++) {
        scanf("%d", &input);
        if (input == 0) {
            pop(&stack);
        }
        else {
            push(&stack, input);
        }
    }

    sum = 0;
    while (stack.top != -1) {
        sum += pop(&stack);
    }

    printf("%lld", sum);

    return 0;
}