#include <stdio.h>
#include <stdlib.h>

typedef struct subject 
{
    int score;
    int time;
} Subject;

typedef struct stack
{
    Subject *subject;
    int top;
} Stack;

void stackSet(Stack *s, int N) {
    s->subject = malloc(sizeof(Subject)*N);
    s->top = -1;
}

void push(Stack *s, int score, int time) {
    s->subject[++(s->top)].score = score;
    s->subject[s->top].time = time;
}

int pop(Stack *s) {
    (s->top)--;
}

int main(){
    int N, jud, score, time, sum = 0;
    Stack stack;

    scanf("%d", &N);

    stackSet(&stack, N);

    for (int i = 0; i < N; i++) {
        fgetc(stdin);
        scanf("%d", &jud);
        if (jud == 1) {
            fgetc(stdin);
            scanf("%d %d", &score, &time);
            push(&stack, score, time);
        }
        stack.subject[stack.top].time--;
        if (stack.subject[stack.top].time == 0) {
            sum += stack.subject[stack.top].score;
            pop(&stack);
        }
    }

    printf("%d", sum);

    return 0;
}