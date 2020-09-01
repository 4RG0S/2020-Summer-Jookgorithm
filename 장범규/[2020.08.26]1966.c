#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    int num1 = *(int *)a;    
    int num2 = *(int *)b;
    if (num1 < num2) {
        return 1;   
    }  
    if (num1 > num2) {
        return -1;
    }
    return 0;
}

typedef struct data
{
    int value;
    int chk;
} Data;

typedef struct queue
{
    Data arr[1000];
    int front;
    int back;    
} Queue;

void init(Queue *q) {
    q->front = -2;
    q->back = -2;
}

void push(Queue *q, Data data) {
    if (q->front == -2) {
        q->front = 0;
        q->back = 0;
        q->arr[q->front] = data;
    }
    else {
        q->arr[++(q->back)] = data;
    }
}

Data pop(Queue *q) {
    return q->arr[(q->front)++];
}

Data front(Queue *q) {
    return q->arr[q->front];
}

int main(){
    int T, N, loc, ipt[1000] = {0};
    Queue queue;
    Data data;

    scanf("%d", &T);

    for (int i = 0; i < T; i++) {
        init(&queue);

        scanf("%d %d", &N, &loc);
        
        for (int j = 0; j < N; j++) {
            data.chk = 0;
            scanf("%d", &data.value);
            push(&queue, data);
            ipt[j] = data.value;
        }
        
        qsort(ipt, N, sizeof(int), compare);

        queue.arr[loc].chk = 1;
        int imp = queue.arr[loc].value;
        
        for (int j = 0; j < N;) {
            if (ipt[j] > front(&queue).value) {
                push(&queue, pop(&queue));
            }
            else {
                Data tmp = pop(&queue);
                if (tmp.value == imp && tmp.chk == 1) {
                    printf("%d\n", j+1);
                    break;
                }
                j++;
            }
        }
    }
    return 0;
}