#include <iostream>
#include <queue>

using namespace std;

class Queue {
    int *arr;
    int front;
    int rear;
    int size;

    public:
    //Initialise data structure;

    queue(int n) {
        size = n;
        arr= new int[size];
        front = rear = -1;
    }

    //enqueues 'x' into the queue. Returns true if it get pushed into the stack
    bool enqueue(int value) {
        //to check whther queue is full
        if(( front == 0 && rear == size-1) || (rear == (front-1)%(size-1))) {
            //cout << "queue is full";
            return false;
        }else if (front == -1) //first element to push 
        {
            front = rear = 0;
           
        }
        else if(rear == size-1 && front != 0 ) {
            rear = 0; // to maintain cyclic nature
        }
        else {//normal flow
            rear ++;
        }
        arr[rear] = value;//push inside the queue
        return true;
    }

    //Dequeue top element from queue; Returns -1 if the stack is empty, otherwise
    int dequeue() {
        if(front == -1) {
            //cout << "Queue is empty" << endl;
            return -1; //to check if queue is empty
        }

        int ans = arr[front];
        arr[front] = -1;

        if(front == rear) {
            front = rear = -1;
        }
        else if(front == size - 1) {
            front = 0; // to maintain cyclic nature
        }
        else {
            front ++;
        }

        return ans;
    }
};