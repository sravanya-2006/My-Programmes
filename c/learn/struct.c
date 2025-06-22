#include <stdio.h>
#include <string.h>

// create struct with person1 variable
struct Person {
  char name[50];
  int citNo;
  float salary;
};

int main() {
   struct Person person1,person2;

    strcpy(person1.name,"sravanya");
    strcpy(person2.name,"karthik");

    person1.citNo = 120;
    person2.citNo = 120;

    person1.salary = 0.0;
    person2.salary = 132.3200;

    printf("%s ",person1.name);
    printf("%d ",person1.citNo);
    printf("%f ",person2.salary);

  return 0;
}