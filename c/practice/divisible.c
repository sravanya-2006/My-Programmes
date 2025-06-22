#include <stdio.h>

int main() {
    int n;
    printf("enter any no.: ");
    scanf("%d",&n);

    if( n%2 == 0) {
        printf("it is divisible by 2");
    }
    else {
        printf("it is not divisible by 2");
    }
}
