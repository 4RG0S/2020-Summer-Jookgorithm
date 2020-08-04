#include <stdio.h>
#include <stdlib.h>

typedef struct heap
{
    int *arr;
    int idx;
} Heap;

void swap(int *a, int *b) {
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

void heapSet(Heap *h, int size) {
    h->arr = malloc(sizeof(int)*size*size);
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
    int N, input;
    Heap heap;

    scanf("%d", &N);
    heapSet(&heap, N);

    for (int i = 0; i < N*N; i++) {
        fgetc(stdin);
        scanf("%d", &input);
        push(&heap, input);
    }

    for (int i = 0; i < N-1; i++) {
        pop(&heap);
    }

    printf("%d", pop(&heap));

    return 0;
}