#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    long long num1 = *(long long *)a;    
    long long num2 = *(long long *)b;
    if (num1 < num2) {
        return -1;   
    }  
    if (num1 > num2) {
        return 1;
    }
    return 0;
}

typedef struct data
{
    long long value;
    int frequency;
} Data;

typedef struct stack
{
    Data *arr;
    int top;
} Stack;

void init(Stack *s) {
    s->arr = malloc(sizeof(Data)*100000);
    s->top = -1;
}

void push(Stack *s, Data d) {
    s->arr[++(s->top)] = d;
}

int main(){
    long long card[100000];
    int N;
    Stack stack;
    Data data;

    init(&stack);

    scanf("%d", &N);
    
    for (int i = 0; i < N; i++) {
        scanf("%lld", &card[i]);
    }
    
    qsort(card, N, sizeof(long long), compare);

    for (int i = 0; i < N; i++) {
        if (i == 0) {
            data.value = card[i];
            data.frequency = 1;
            continue;
        }
        if (data.value != card[i]) {
            if (stack.top == -1) {
                push(&stack, data);
            }
            else {
                if (stack.arr[stack.top].frequency < data.frequency) {
                    push(&stack, data);
                }
            }
            data.value = card[i];
            data.frequency = 1;
        }
        else {
            data.frequency++;
        }
    }

    if (stack.top == -1) {
        printf("%lld", data.value);
    }
    else {
        if (stack.arr[stack.top].frequency >= data.frequency) {
            printf("%lld", stack.arr[stack.top].value);
        }
        else {
            printf("%lld", data.value);
        }
    }
    
    return 0;
}