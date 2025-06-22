#include <iostream>

using namespace std;

class bank
{
    private:
    float balance;
    int accountNumber;

    public:
    string name;

    bank(string name,int accountNumber) {
        this->name = name;
        this->accountNumber = accountNumber;
        balance = 0;
    }

    float getBalancce() {
        return balance;
    }

    void depositMoney(float amount) {
        balance += amount;
    }

    void withdrawMoney(float amount) {
        balance -= amount;
    }

    void transferMoney(float amount,bank* account) {
        this->balance -= amount;
        account->balance += amount;
    }

    void printDetainls() {
        cout << "Account number: " << accountNumber << " belongs to " << name << endl;
    }
};

int main() {

    bank a1 = bank("sravanya",232423);
    bank a2 = bank("karthik",382610);
    bank a3 = bank("raman",3224892);

    a1.depositMoney(50.0);
    a1.withdrawMoney(32.32);
    a1.transferMoney(55555.33,&a2);
    a2.transferMoney(3.3,&a3);

    a1.printDetainls();
    a2.printDetainls();

    cout << a1.getBalancce() << endl;
    cout << a2.getBalancce() << endl; 
    cout << a3.getBalancce() << endl;
}
 