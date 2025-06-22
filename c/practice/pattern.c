#include <stdio.h>	 

int main() { 

    int n; 

    scanf("%d",&n); 
    int a[n][n]; 
    for(int i=0;i<n;i++){ 

        for(int j=0;j<n;j++){ 

            if(i==j) {}
            printf("*");

            else printf("O"); 
        } 
        printf("\n"); 
    } 
    return 0; 
} 