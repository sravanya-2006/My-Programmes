#include <stdio.h>
#include <math.h>

int main() {
    int a,b,c;
    double d,z,r1,r2;

    printf("enter any three numbers a,b,c: ");
    scanf("%d %d %d",&a,&b,&c);
    z= pow(b,2);
    printf ("z: %f\n", z);
    
    d = ((z - (4*a*c)));

 if (d<0) {
    printf ("square root is imaginary");
    return 0; }
     else {
     printf("discriminant: %0.2lf",d); }
     printf("\n");
  r1 = (-b+d)/(2*a);
  r2 = (-b-d)/(2*a);
  printf("r1: %0.2lf\n",r1);
  printf("r2: %0.2lf\n",r2);
     return 0;
}

