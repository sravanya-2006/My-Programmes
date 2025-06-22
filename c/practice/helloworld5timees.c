#include <stdio.h>
#include <math.h>

int ishello(int num) {
    for(int i=0;i<=5;i++) {
        printf("Hello world!\n");
    }
   return num;
}

int main() {
    int a,num;
    a =  ishello(num);
    printf("%s\n",a);

}
