 #include <stdio.h>

 int main() {
     int n,i,s;
     printf("the sum of squares of n no.s where n is: ");
     scanf("%d",&n);
     for(i=1;i<=n;i++) {
        s=s + (i*i);
    }
     printf("sum of squares of n no.s is : %d ",s);
 }

#include <stdio.h>

int main() {
    int n,s;
    printf("the sum of squares of n no.s where n is: ");
    scanf("%d", &n);

    s=((n)*(n+1)*((2*n)+1))/6;
    printf("the sum of squares of n no.s is: %d",s);
}