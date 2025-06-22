#include <stdio.h>

int main() {
    int a,b,c;
    a = 0;
    b = 1;
    c = 2;

    if (a > b && a > c) {
        printf("%d",a);
    }
    else if (b > a && b > c) {
        printf("%d",b);
    }
    else {
        printf("%d",c);
    }

    int max = (a > b) ? a : b;  // shorthand if else
    int min = (a < b) ? a : b;
    printf("\n%d\n",max);

    int s= 2;
    switch (s)
    {
    case 0:
        printf("s is zero\n");
        break;
    case 1:
        printf("s is one\n");
        break;
    case 2:
        printf("s is two\n");
        break;
    case 3:
        printf("s is three\n");
        break;
    
    default:
        printf("s is not zero, one, two, three\n");
        break;
    }

}
