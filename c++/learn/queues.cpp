#include <iostream>
#include <queue>

class Queue {

    int* arr;
    int front;
    int rear;
    int size;

    public:
       
       Queue() {

        size = 1000001;
        arr = new int[size];
        front = 0;
        rear = 0;

        //Implement the Constructor

       }

       bool isEmpty() {
           
        if(front == rear)
        {
            return true;
        }
        else {
            return false;
        }
        //Implement the isEmpty() function
       }

       void enqueue(int data) {
         if(rear == size) {
            cout << "Queue is full" << endl;
         } else {
             arr[rear] = data;
             rear++;
         }
       }

       int dequeue() {
        if(front == rear) 
        {
            return -1;
        } 
        else {

            int ans = arr[front];
            arr[front] = -1;
            front++;

            if(front==rear) {
                front = 0;
                rear = 0;
            }
         return ans;
        
        }
       }
}