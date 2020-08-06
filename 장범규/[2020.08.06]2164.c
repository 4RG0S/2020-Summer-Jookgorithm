#include <stdio.h>
#include <stdlib.h>

typedef struct queue
{
    int *arr;
    int front;
    int back;
} Queue;

void queueSet(Queue *q, int N) {
    q->arr = malloc(sizeof(int)*(N+N-2));
    for (int i = 1; i <= N; i++) {
        q->arr[i-1] = i;
    }
    q->front = 0;
    q->back = N-1;
}

int size(Queue *q) {
    return (q->back)-(q->front)+1;
}

void push(Queue *q, int value) {
    q->arr[++(q->back)] = value;
}

int pop(Queue *q) {
    return q->arr[(q->front)++];
}

int back(Queue *q) {
    return q->arr[q->back];
}

int main(){
    int amt;
    Queue queue;

    scanf("%d", &amt);

    if (amt == 1) {
        printf("%d", 1);
        return 0;
    }
    
    queueSet(&queue, amt);

    while (size(&queue) != 2) {
        pop(&queue);
        push(&queue, pop(&queue));
    }
    
    printf("%d", back(&queue));

    return 0;
}