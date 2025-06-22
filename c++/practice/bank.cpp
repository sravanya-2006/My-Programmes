#include <iostream>

using namespace std;

class bank {
    private:
    int accountNumber;
    float balance;
    string name;
    int pin;

    public:

    bank(int accountNumber,float balance,string name,int pin) {
        this->name = name;
        this->balance = balance;
        this->accountNumber = accountNumber;
        this->pin = pin;
    }

    float viewbalance() 
    {
        return balance;
    }

    string changeName(string name) 
    {
        this->name = name;
        return name;
    }
    
    int changepin(int currentpin,int newpin)
    {
        if(this->pin == currentpin) {
            this->pin = newpin;
            return 1;
        }return 0;
    }

    int transferMOney(float amount, bank* account,int currentpin)
    {
        if(balance > amount && this->pin == currentpin) {
            this->balance -= amount;
            account->balance += amount;
            return 1;
        }
        return 0;
    }
    string viewName()
    {
        return name;
    }
    int viewaccountNumber()
    {
        return accountNumber;
    }
    int viewpin() 
    {
        return pin;
    }

};

int main() {
    bank a1 = bank(123456,10000, "sravanya",1596);
    bank a2 = bank(123457,10,"karthik",2348);

    cout << a1.viewName() << endl;
    a1.changeName("sky");
    cout << a1.viewName() << endl;

    
    int change = a1.changepin(1596,1000);
    if(change == 1) {
        cout << "pin changed" << endl;
    }else {
        cout << "enter correct pin" << endl;
    }

    int money = a1.transferMOney(12.3,&a2,1000);
    if(money == 1) {
        cout << "success" << endl;
    }else{
    cout << "failure" << endl;
    }

   
}   
