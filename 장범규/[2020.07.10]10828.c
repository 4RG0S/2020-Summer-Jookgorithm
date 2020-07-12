#include <stdio.h>
#include <string.h>

typedef struct stack
{
    int arr[10000];
    int top;
} Stack;

void stackSet(Stack *s) {
    s->top = -1;
}

int empty(Stack *s) {
    if (s->top == -1) {
        return 1;
    }
    else {
        return 0;
    }
}

int full(Stack *s) {
    if (s->top+1 == 10000) {
        return 1;
    }
    else {
        return 0;
    }
}

void push(Stack *s, int value) {
    if (full(s)) {
        return;
    }
    else {
        s->arr[++(s->top)] = value;
    }
}

int pop(Stack *s) {
    if (empty(s)) {
        return -1;
    }
    else {
        return s->arr[(s->top)--];
    }
}

int size(Stack *s) {
    return s->top+1;
}


int top(Stack *s) {
    if (empty(s)) {
        return -1;
    }
    else {
        return s->arr[s->top];
    }
}

int main(){
    int command_n, value;
    char command[6];
    Stack stack;
    
    scanf("%d", &command_n);
    fgetc(stdin);

    stackSet(&stack);

    for (int i = 0; i < command_n; i++) {
        scanf("%s", command);
        fgetc(stdin);
        if (!strcmp(command, "push")) {
            scanf("%d", &value);
            fgetc(stdin);
            push(&stack, value);
        }
        else if (!strcmp(command, "pop")) {
            printf("%d\n", pop(&stack));
        }
        else if (!strcmp(command, "empty")) {
            printf("%d\n", empty(&stack));
        }
        else if (!strcmp(command, "size")) {
            printf("%d\n", size(&stack));
        }
        else if (!strcmp(command, "top")) {
            printf("%d\n", top(&stack));
        }
    }
    return 0;
}