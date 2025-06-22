#include <stdio.h>
#include <math.h>
int main() {
    int I;
   double R,T;
   double   SFV, CFV;
    printf("enter the value of investment amount I in rupees: ");
    scanf("%d",&I);
    printf("enter the value of interest rate in percentage: ");
    scanf("%lf",&R);
    printf("enter the value of time period in years: ");
    scanf("%lf",&T);

    SFV = I * (1 + (R/100*T));
    CFV = I * pow((1 + R/100), T);
    
    printf("future value of money in simple interest: %.2lf\n",SFV);
    printf("future value of money in compound interest: %.2lf\n",CFV);
    

}


     
