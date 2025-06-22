#include <stdio.h>

int main() {
    int p,a,b;
    printf("enter base value a and power value b: ");
    scanf("%d %d", &a,&b);

    for(int p=1;p<=b;p++) {
        p=p*a;
           printf("a raised to power of b is: %d",p);   
    }
}
