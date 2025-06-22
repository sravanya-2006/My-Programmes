//factorial using recursion

#include <stdio.h>

int fact(int n) {
    // Base Case
    if (n == 1 || n == 0) {
        return 1;
    }

    // Calling recursion
    return n * fact(n-1);
}

int fib(int n) {

    // Base Case
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;

    // Calling recursion
    return fib(n-1) + fib(n-2);
}

int main() {
    int n;
    printf("enter n: ");
    scanf("%d",&n);
    printf("fib of %d is %d",n,fib(n));
}
    
    







