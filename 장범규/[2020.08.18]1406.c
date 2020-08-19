#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct node
{
    struct node *previous;
    struct node *next;
    char data;
};

int main(){

    char initial[100001], input;
    int cmd_n;

    scanf("%s", initial);

    struct node *head = malloc(sizeof(struct node));
    
    head->data = 'S';
    head->previous = NULL;
    head->next = NULL;

    int len = strlen(initial);
    for (int i = 0; i < len; i++) {
        struct node *newNode = malloc(sizeof(struct node));
        newNode->data = initial[i];
        newNode->previous = head;
        newNode->next = NULL;
        head->next = newNode;
        head = newNode;
    }
    
    scanf("%d", &cmd_n);

    for (int i = 0; i < cmd_n; i++) {
        fgetc(stdin);
        scanf("%c", &input);
        if (input == 'L') {
            if (head->previous != NULL) {
                head = head->previous;
            }
        }
        else if (input == 'D') {
            if (head->next != NULL) {
                head = head->next;
            }
        }
        else if (input == 'B') {
            if (head->previous != NULL) {
                struct node *del = malloc(sizeof(struct node));
                del = head;
                head = del->previous;
                if (del->next != NULL) {
                    del->next->previous = head;
                    head->next = del->next;
                    del->previous = NULL;
                }
                else {
                    head->next = NULL;
                }
                free(del);
            }
        }
        else {
            fgetc(stdin);
            scanf("%c", &input);
            struct node *newNode = malloc(sizeof(struct node));
            newNode->data = input;
            newNode->previous = head;
            if (head->next != NULL) {
                newNode->next = head->next;
                head->next->previous = newNode;
            }
            else {
                newNode->next = NULL;
            }
            head->next = newNode;
            head = newNode;
        }
    }
    
    while (head->data != 'S') {
        head = head->previous;
    }

    head = head->next;
    while (head != NULL) {
        printf("%c", head->data);
        head = head->next;
    }
    
    return 0;
}
/*
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct node
{
    struct node *previous;
    struct node *next;
    char data;
};

void add(struct node *target, char data) {
    struct node *newNode = malloc(sizeof(struct node));
    newNode->next = target->next;
    newNode->data = data;

    newNode->previous = target;
    target->next = newNode;
}

struct node *invert(struct node *head) {
	struct node *middle, *tail;
    middle = NULL; 
    
    while (head != NULL) {
    	tail = middle;
        middle = head;
        head = head->next;
        middle->next = tail;
    }
    return middle;
}

int main(){
    char initial[100001], input;
    int cmd_n;

    scanf("%s", initial);
    scanf("%d", &cmd_n);

    struct node *head = malloc(sizeof(struct node));
    
    head->data = 'S';
    head->previous = NULL;
    head->next = NULL;
    
    int len = strlen(initial);
    for (int i = 0; i < len; i++) {
        add(head, initial[i]);
    }
    
    for (int i = 0; i < cmd_n; i++) {
        fgetc(stdin);
        scanf("%c", &input);
        if (input == 'L') {
            if (head->next != NULL) {
                head = head->next;
            }
        }
        else if (input == 'D') {
            if (head->previous != NULL) {
                head = head->previous;
            }
        }
        else if (input == 'B') {
            if (head->next != NULL) {
                head->next->data = 'N';
                head = head->next;
            }
        }
        else {
            fgetc(stdin);
            scanf("%c", &input);
            add(head, input);
        }
    }
    
    while (head->data != 'S') {
        head = head->previous;
    }
    
    head = invert(head);
    while (head->data != 'S') {
        if (head->data != 'N') {
            printf("%c", head->data);
        }
        head = head->next;
    }
    
    return 0;
}
*/