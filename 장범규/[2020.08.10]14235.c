#include <stdio.h>
#include <stdlib.h>

typedef struct heap
{
    int arr[500000];
    int idx;
} Heap;

void swap(int *a, int *b) {
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

void heapSet(Heap *h) {
    h->idx = 0;
}

void push(Heap *h, int value) {
    h->arr[++(h->idx)] = value;
    
    int child = h->idx;
    int parent = child/2;
    
    while (child > 1 && h->arr[parent] < h->arr[child]) {
        swap(&(h->arr[parent]), &(h->arr[child]));
        child = parent;
        parent = child/2;
    }
}

int pop(Heap *h) {
    int result = h->arr[1];

    swap(&(h->arr[1]), &(h->arr[h->idx]));
    h->idx--;

    int parent = 1;
    int child = parent*2;
    
    if (child+1 <= h->idx) {
        child = (h->arr[child] > h->arr[child+1]) ? child : child+1;
    }

    while (child <= h->idx && h->arr[parent] < h->arr[child]) {
        swap(&(h->arr[parent]), &(h->arr[child]));

        parent = child;
        child = child*2;
        
        if (child+1 <= h->idx) {
            child = (h->arr[child] > h->arr[child+1]) ? child : child+1;
        }
    }

    return result;
}

int main(){
    int N, input, value;
    Heap heap;

    scanf("%d", &N);
    heapSet(&heap);

    for (int i = 0; i < N; i++) {
        fgetc(stdin);
        scanf("%d", &input);
        if (input == 0) {
            if (heap.idx == 0) {
                printf("%d\n", -1);
            }
            else {
                printf("%d\n", pop(&heap));
            }
        }
        else {
            for (int j = 0; j < input; j++) {
                fgetc(stdin);
                scanf("%d", &value);
                push(&heap, value);
            }
        }
    }

    return 0;
}