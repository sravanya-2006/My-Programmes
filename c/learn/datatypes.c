#include <stdio.h>

int main() {
    // bool,int,float,long,double,char  
    // diclare datatype variable name
    // initialize 
    int a = 0,b = 1; // no inverted commas
    char c = 'a'; // char interved commas ''

    // %{datatype}  , variable
    printf("dsdsf %d dsfd%dsdf %c     sdfs%d",a,b,c,4);
    printf("\n\t\0"); // \n new line \t tab \0 termination char


    // Scanf 
    int s;
    printf("s input\n");
    scanf("%d",&s);
    printf("%d",s);
}