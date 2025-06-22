#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct node
{

    int value;
    struct node *next;
};

void function(struct node *list, int num)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    temp->value = num;
    temp->next = list->next;
    list->next = temp;
}
void right(struct node *list, int num)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    struct node *p = list;
    for (int i = 0; i <= 3; i++)
    {
        p = p->next;
        struct node *temp;
        temp = (struct node *)malloc(sizeof(struct node));
        p->next = temp;
        temp->next = 0;
        temp->value = num;
    }
}

int getlength(struct node* list, int num)
{
    struct node *p = list;
    int length = 0;
    while(p->next !=0) {
        length = length +1;
        p = p->next;
    }
    return length;  
}
void print(struct node *list)
{
    struct node *p = list;
    for (int i = 0; i <= 3; i++)
    {
        printf("%d ", p->value);
        p = p->next;
    }
    printf("%d\n", p->value);
}
int main()
{
    struct node l1;
    l1.value = 10;
    l1.next = 0;

    right(&l1,1);
    right(&l1,3);
    right(&l1,5);
    

    print(&l1);
}
