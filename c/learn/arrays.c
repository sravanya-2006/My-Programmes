#include <stdio.h>

int main() {

    int arrr[10];    //  {0,0,0,0,0,0,0,}  0 indexed array mention size when declaring
    int nums[] = {1,2,3,4};  // no size when declaring and initilazing sieze 4
    arrr[0] = 1;     // access 0th index - starting value
    arrr[1] = 2;     // access 1st index

    float arr[20];  // array of length 20 stores float values
    arr[0] = 2.4;
    arr[6] = -4.6;
    arr[16] = 23.3;
    arr[1] = 23.5;

    int index = 1;


    // string is a char array
    char name[] = "sravanya"; // int array flower bracket char array no need
    char newName[] = {'l','a','k','\0'}; // \0 needed when manually writing string

    // array with loop
    int numArray[5];
    printf("Enter any 5 numbers: ");
    int i,p=1;

    for(i=0;i<5;) {
        scanf("%d",&numArray[i]);
        p = p*numArray[i];
        i++;
        }
    printf("\n");
     printf("the product of 5 numbers is: %d\n",p);
}

