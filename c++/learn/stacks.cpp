#include <iostream>
using namespace std;

class Stack {
private:
    int* arr;
    int top;
    int size;

public:
    // Constructor
    Stack(int size) {
        this->size = size;
        arr = new int[size];
        top = -1;
    }

    // Destructor
    ~Stack() {
        delete[] arr;
    }

    // Push method
    void push(int element) {
        if (top < size - 1) {
            top++;
            arr[top] = element;
        } else {
            cout << "Stack overflow" << endl;
        }
    }

    // Pop method
    void pop() {
        if (top >= 0) {
            top--;
        } else {
            cout << "Stack underflow" << endl;
        }
    }

    // Peek method
    int peek() const {
        if (top >= 0) {
            return arr[top];
        } else {
            cout << "Stack is empty" << endl;
            return -1;
        }
    }

    // isEmpty method
    bool isEmpty() const {
        return top == -1;
    }
};

int main() {
    Stack st(5);

    st.push(22);
    st.push(43);
    st.push(44);

    cout << "Before pop: " << st.peek() << endl;

    st.pop();

    cout << "After pop: " << st.peek() << endl;

    return 0;
}
