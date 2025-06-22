//without using function
#include <stdio.h>
#include <math.h>

  
void main () {

int i,n,fact = 1;
 
  printf (" Enter value of n : ");
  scanf ("%d", &n);

 for (i=1;i<=n; i++)
      {
        fact = fact*i;
      }
printf("the factorial of the number: %d\n",fact);

}



//by using function
#include <stdio.h>

int fact(int n) {
int factorial = 1;

 for (int i=1;i<=n; i++)
      {
        factorial = factorial*i;
      }
      return factorial;
}
int main() {

int n,z;
printf("Enter the value of n: ");
scanf("%d",&n);

z= fact(n);
printf("The factorial of the give no. is: %d\n",z);

return 0;
}

//recursion
