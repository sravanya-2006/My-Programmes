#include <iostream>

using namespace std;

class person
{
    private:
    int secreat = 32;

    public: 
    string name;
    int age;
    int salary;

    void printDetails() {
        cout << name << " is " << age << " has salary of " << salary << endl;
    }
};

int main() {
    person srav = person();
    person kart = person();

    srav.name = "Agent Sravanya";
    srav.age = 17;
    srav.salary = 100000;

    kart.name = "Intellgent Karthik";
    kart.age = 20;
    kart.salary = 230000;

    srav.printDetails();
    kart.printDetails();

}