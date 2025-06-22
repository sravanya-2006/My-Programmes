 #include <stdio.h>
 int main() {
    int n;
    printf(" enter the no. of digits: ");
    scanf("%d",&n);
    
 
  int numArray[n];
    printf("Enter all the digits of no.s: ");
    int i,s=0;

    for(i=0;i<n;i++) {
        scanf("%d",&numArray[i]);
        s= s + numArray[i];
        
        }
    printf("\n");
     printf("the sum of n digits of no. is: %d\n",s);
}


