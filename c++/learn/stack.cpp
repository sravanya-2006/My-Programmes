#include <iostream>
#include<stack>
using namespace std;

int main() {

    //creation of stack
    stack<int> s;

    //push operation
    s.push(2);
    s.push(3);
    s.push(4);

    //pop
    s.pop();

    cout << "Printing the top element: " << s.top() << endl;

    if(s.empty()) {
        
        cout << "STack is empty" << endl;
    } else {
        cout << "STack is not empty" << endl;
    }

    cout << "Size of the stack is: " << s.size() << endl;

    return 0;
}