#include <iostream>

using namespace std;

int main()
{
  int a;
  cout << "type an integer" << endl;
  cin >> a;
  if (a > 100) {
    cout << a << " is greater than 100" << endl;
  } else {
    cout << a << " lessthan 100" << endl;
    for (int i = 0; i < a; i++)
    {
      cout << "printing " << a << " times" << endl;
    }
  }
  return 0;
}