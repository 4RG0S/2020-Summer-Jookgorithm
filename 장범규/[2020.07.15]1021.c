#include <stdio.h>
#include <stdlib.h>

typedef struct queue
{
    int *arr;
    int back;
} Queue;

void queueSet(Queue *q, int arrlen) {
    q->arr = malloc(sizeof(int)*arrlen);
    for (int i = 1; i <= arrlen; i++) {
        q->arr[i-1] = i;
    }
    q->back = arrlen-1;
}

int size(Queue *q) {
    return (q->back)+1;
}

void pop(Queue *q) {
    for (int i = 0; i < q->back; i++) {
        q->arr[i] = q->arr[i+1];
    }
    q->back--;
}

void moveRight(Queue *q) {
    int tmp = q->arr[q->back];
    for (int i = size(q)-1; i > 0; i--) {
        q->arr[i] = q->arr[i-1];
    }
    q->arr[0] = tmp;
}

void moveLeft(Queue *q) {
    int tmp = q->arr[0];
    for (int i = 0; i < size(q)-1; i++) {
        q->arr[i] = q->arr[i+1];
    }
    q->arr[q->back] = tmp;
}

int searchIndex(Queue *q, int value) {
    int i;
    for (i = 0; i < size(q); i++) {
        if (q->arr[i] == value) {
            break;
        }
    }
    return i;
}

int main(){
    int arrlen, count, idx[50];
    int ml = 0, mr = 0;
    Queue queue;

    scanf("%d %d", &arrlen, &count);

    queueSet(&queue, arrlen);
    
    for (int i = 0; i < count; i++) {
        scanf("%d", &idx[i]);
    }

    for (int j = 0; j < count; j++) {
        for (int k = 0; idx[j] != queue.arr[0]; k++) {
            if (size(&queue)/2 < searchIndex(&queue, idx[j])) {
                moveRight(&queue);
                mr++;
            }
            else {
                moveLeft(&queue);
                ml++;
            }
        }
        pop(&queue);
    }

    printf("%d", mr+ml);
    
    return 0;
}