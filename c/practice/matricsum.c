#include <stdio.h>
void main () {
    int A [3][3], B [3][3] , i,j;
    
printf("\nEneter elements of 1st matrix:\n");
for(i=0; i < 3; ++i)
for(j=0; j < 3; j++) {
    printf("Enter element a%d%d: ",i,j);
    scanf("%d", & A[i][j]);
}

printf("\nEnter elements of 2nd matrix:\n");
for(i=0; i<3; i++)
for(j=0; j<3; j++) {
    printf("Enter element b%d%d:",i,j);
    scanf("%d", & B[i][j]);
}
int C[i][j];
for(i=0;i<3;i++) 
for(j=0;j<3;j++) {
    C[i][j] = A[i][j] + B[i][j];
}


printf("\nsum of two matrices:\n");
for(i=0;i<3;i++) {
for(j=0;j<3;j++) {
    printf("%d\t",C[i][j]);
}
printf("\n");
}
}
    
   
    


