#include <stdio.h>
#include <stdlib.h>

typedef struct stack
{
    int *arr;
    int top;
} Stack;

void set(Stack *s, int n) {
    s->arr = malloc(sizeof(Stack)*n);
    s->top = -1;
}

void push(Stack *s, int value) {
    s->arr[++(s->top)] = value;
}

int pop(Stack *s) {
    s->arr[(s->top)--];
}

int size(Stack *s) {
    return s->top+1;
}

int main(){
    int N, *arr;
    Stack stack, result;

    scanf("%d", &N);

    set(&stack, N);
    set(&result, N);
    arr = malloc(sizeof(int)*N);

    for (int i = 0; i < N; i++) {
        fgetc(stdin);
        scanf("%d", &arr[i]);
    }

    push(&stack, -1);
    for (int i = N-1; i >= 0; i--) {
        for (; stack.arr[stack.top] <= arr[i];) {
            pop(&stack);
            if (size(&stack) == 0) {
                break;
            }
        }
        if (size(&stack) == 0) {
            push(&result, -1);
        }
        else {
            push(&result, stack.arr[stack.top]);
        }
        push(&stack, arr[i]);
    }

    for (int i = 0; i < N; i++) {
        printf("%d ", result.arr[result.top]);
        pop(&result);
    }
    free(arr);
    return 0;
}