#include <stdio.h>

float max(float x, float y) {

    float max = (x > y) ? x : y;
   // printf("%f\n",max);
    return max;
}

float main() {
 
 float x,y,z;
 printf("enter the value of x\n");
 scanf("%f",&x);
 printf("enter the value of y\n");
 scanf("%f", &y);

 z = max(x,y);
 printf("the maximum of two numbers is %0.2f",z);

}