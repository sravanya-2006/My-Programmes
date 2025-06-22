//by using third variable
#include <stdio.h>

int main() {
    int a,b,temp;
    printf("Enter num 1:");    
    scanf("%d",&a);
    printf("Enter num 2:");
    scanf("%d",&b);

    temp = a;
    a = b;
    b = temp;

    printf("value of num 1 = %d\n",a);
    printf("value of num2 = %d\n",b);
    
}



//without using third variable
#include<stdio.h>  
int main()   
{   
  int x, y;  
  printf("Enter the value of x and y?");  
  scanf("%d %d",&x,&y);                          
  printf("before swapping numbers: %d   %d\n",x,y);  
  
/*swapping*/  
  x = x + y;   
  y = x - y;    
  x = x - y;  
  printf("After swapping: %d    %d",x,y);   
  return 0;   
}
    

