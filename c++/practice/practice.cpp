#include <iostream>

using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    for (int num = a; num <= b; num++) {
        bool is_prime = true;  // Assume the number is prime initially
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                is_prime = false;  // Found a divisor, so it's not prime
                break;
            }
        }
        if (is_prime && num > 1) {  // Ensure num is greater than 1
            cout << num << endl;
        }
    }

    return 0;
}

