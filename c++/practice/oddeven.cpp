#include<iostream>
using namespace std;

bool isEven(int a) {
    return a%2 == 0;  
}

bool isOdd(int a) {
    return a%2 != 0;
}

int main() {
    int a;
    
    cout << "enter any number: " << endl;
    cin >> a;

    if(isEven(a)) {
        cout << "the number you entered is even" << endl;
    }else {
        cout << "the number you entered is odd" << endl;
    }
}