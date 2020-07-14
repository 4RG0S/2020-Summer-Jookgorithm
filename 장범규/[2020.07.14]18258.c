#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct queue
{
    int *arr;
    int front;
    int back;
} Queue;

void queueSet(Queue *q) {
    q->front = -2;
    q->back = -2;
}

int size(Queue *q) {
    if (q->front == -2) {
        return 0;
    }
    else {
        return (q->back)-(q->front)+1;
    }
}

int empty(Queue *q) {
    if (size(q) == 0) {
        return 1;
    }
    else {
        return 0;
    }
}

int full(Queue *q) {
    if (size(q) == 2000000) {
        return 1;
    }
    else {
        return 0;
    }
}

void push(Queue *q, int value) {
    if (full(q)) {
        return;
    }
    if (q->front == -2) {
        q->front = 0;
        q->back = 0;
        q->arr[q->front] = value;
    }
    else {
        q->arr[++(q->back)] = value;
    }
}

int pop(Queue *q) {
    if (empty(q)) {
        return -1;
    }
    else {
        return q->arr[(q->front)++];
    }
}

int front(Queue *q) {
    if (empty(q)) {
        return -1;
    }
    else {
        return q->arr[q->front];
    }
}

int back(Queue *q) {
    if (empty(q)) {
        return -1;
    }
    else {
        return q->arr[q->back];
    }
}

int main(){
    int command_n, value;
    char command[6];
    Queue queue;
    
    scanf("%d", &command_n);
    fgetc(stdin);

    queueSet(&queue);
    queue.arr = malloc(sizeof(int)*2000000);
    
    for (int i = 0; i < command_n; i++) {
        scanf("%s", command);
        fgetc(stdin);
        if (!strcmp(command, "push")) {
            scanf("%d", &value);
            fgetc(stdin);
            push(&queue, value);
        }
        else if (!strcmp(command, "pop")) {
            printf("%d\n", pop(&queue));
        }
        else if (!strcmp(command, "empty")) {
            printf("%d\n", empty(&queue));
        }
        else if (!strcmp(command, "size")) {
            printf("%d\n", size(&queue));
        }
        else if (!strcmp(command, "front")) {
            printf("%d\n", front(&queue));
        }
        else if (!strcmp(command, "back")) {
            printf("%d\n", back(&queue));
        }
    }
    return 0;
}