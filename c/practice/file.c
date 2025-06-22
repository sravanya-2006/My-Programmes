#include<stdio.h>
int main(){
   int marks;
   
   printf("\nEnter your Marks Between 0 To 100:");
   
   printf("\nEnter your Mark: ");
   scanf("%d", &marks);
   
   if(marks>100) { /* Marks greater than 100 */ 
    printf("\nPlease enter your marks in limit\n");
   }
   else
   {
switch(marks/10)
   {
       case 10 :
       case 9 : 
           printf("\n Your Grade is: A");
           break;
       case 8 :  
           printf("\n Your Grade is: B" );
           break;
       case 7 : 
           printf("\n Your Grade is: C" );
           break;
       case 6 :  
           printf("\n Your Grade is: D" );
           break;
       case 5 : 
           printf("\n Your Grade is: E" );
           break;
       case 4 :
           printf("\n Your Grade is: E--");
           break;
       default : /* Marks less than 40 */
            printf("\n You Grade is: F or Fail\n");
   }
}
   
}
