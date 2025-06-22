#include <iostream>

using namespace std;

int max(int a,int b,int c) {
    if(a>b && a>c) {
        return a;
    }else if(b>a && b>c) {
        return b;
    }else return c;
}

int main() {
    int a,b,c;
    cout << "enter any 3 numbers: " << endl;
    cin >> a >> b >> c;

    int high = max(a,b,c);
     for (int i = 0; i < high; i++)
    {
      cout << "printing " << high << " times" << endl;
    }



}
