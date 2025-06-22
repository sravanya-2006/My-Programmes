#include <stdio.h>

int main() {
    int numStudents;
    printf("Enter the number of students in the class: ");
    scanf("%d", &numStudents);
    
    int marks[numStudents];
    printf("Enter the marks of the students:\n");
    
    for (int i=0; i<numStudents; i++) {
        printf("Enter marks out of 100 scored by student %d: ", i+1);
        scanf("%d", &marks[i]);
    }
    
    int highestMark = marks[0];
    int lowestMark = marks[0];
    

    for (int i=1; i<numStudents; i++) {
        if (marks[i] > highestMark) {
            highestMark = marks[i];
        }
        
        if (marks[i] < lowestMark) {
            lowestMark = marks[i];
        }
        
        }
        printf("The highest mark in the class is: %d\n", highestMark);
        printf("The lowest mark in the class is: %d\n", lowestMark);
    
    return 0;
}