#include <stdio.h>

float dep(float p, float s, float l) {

    float dep=(p-s)/l;
    return dep;
}

float main() {
 
 float p,s,l,a;
 printf("enter the value of Purchase price of the asset p: \n");
 scanf("%f", &p);
 printf("enter the value of approximate salvage amount s: \n");
 scanf("%f", &s);
 printf("enter the value of estimated useful life of asset l: \n");
 scanf("%f", &l);

 a= dep(p,s,l);
 printf("the dep  is %0.2f",a);

}
