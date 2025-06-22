#include <stdio.h>
#include <stdlib.h>

struct node
{
    int value;
    struct node* next;
};

void insert(struct node* list, int num) {
    struct node* temp;
    temp = (struct node*) malloc(sizeof(struct node));
    temp->value = num;
    temp->next = list->next;
    list->next = temp;
}

void addLast(struct node* list, int num) {
    struct node* p = list;
    while(p->next !=0) {
       p = p->next;
    }
    struct node* temp;
    temp = (struct node*) malloc(sizeof(struct node));
    p->next = temp;
    temp->next = 0;
    temp->value = num;
    
}

void addFirst(struct node** list,int num) {
    struct node* temp = (struct node*) malloc(sizeof(struct node));
    temp->value = num;
    temp->next = *list;
    *list = temp;
}

int getlength(struct node* list)
{
    struct node *p = list;
    int length = 0;
    while(p->next != NULL) {
        length = length +1;
        p = p->next;
    }
    length = length + 1;
    return length;  
}

void print(struct node* list) {
    struct node* p = list;
    while(p->next != NULL) {
        printf("%d ",p->value);
        p = p->next;
    }
    printf("%d\n",p->value);
}

void insertat(struct node* list,int num,int pos) {
    struct node* temp = (struct node*)malloc(sizeof(struct node));
    temp->value = num;
    struct node* p = list;
    for(int i=0;i<=pos-2;i++) {
        p = p->next;
    }
    temp->next = p->next;
    p->next = temp;
}

int getelementat(struct node* list,int pos) {
    struct node* p = list;
    for(int i=0;i<=pos-1;i++) {
        p = p->next;
    }
    return p->value;
}

void deleteNode(struct node* list,int pos) {
    struct node* p = list;
    for(int i=0;i<=pos-2;i++) {
        p = p->next;
    }
    struct node* deletedNode = p->next;
    
    p->next = p->next->next;
    free(deletedNode);
}

int main() {
    struct node* l1 = (struct node*) malloc(sizeof(struct node));
    l1->value = 5;
    l1->next = NULL;

    addLast(l1,6);
    addLast(l1,7);
    addLast(l1,8);

    insertat(l1,0,3);

    print(l1); 
    deleteNode(l1,2);
    deleteNode(l1,0);
    print(l1);
}
