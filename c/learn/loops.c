#include <stdio.h>

int main() {
    int i,w;
    // for loop
    for(i=0; i <= 10; i++) { //increment
        printf("%d\t",i);
    }
    printf("\n\n");
    for(i=10; i >=0; i--) { //decrement
        printf("%d\t",i);
    }
    printf("\n\n");

    // while
    w = 3;
    while (w <= 13)
    {
        printf("%d\t",w);
        w++;
    }
    printf("\n\n");
    
    // do while

    do
    {
        printf("do\n");
    } while (0);
    
    

}