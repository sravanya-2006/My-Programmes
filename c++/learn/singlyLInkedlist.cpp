#include <iostream>
using namespace std;

class Node {
    public:
    int data;
    Node* next;

    // Constructor that initializes data and next
    Node(int data) {
        this->data = data;
        this->next = NULL;
    }
};

int main() {
    // Create a Node with a specific value, e.g., 10
    Node* node1 = new Node(10);

    // Print the data and next pointer
    cout << "Data: " << node1->data << endl;      // Should print: Data: 10
    cout << "Next: " << node1->next << endl;      // Should print: Next: 0 (or nullptr depending on your compiler)

    // Clean up dynamically allocated memory
    delete node1;

    return 0;
}
