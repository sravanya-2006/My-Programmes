#include <stdio.h>

void changeX( int *x ) {
  
  *x = 40;
}

int main() {
    int *x;
    *x = 30;

    printf("%d",*x);

}
