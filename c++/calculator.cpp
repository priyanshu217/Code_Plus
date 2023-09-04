#include <iostream>
using namespace std;

int main(){

    int a , b ;

    cout << "Enter Value of a :" <<endl;
    cin >> a;

    cout << "Enter Value of b :" <<endl;
    cin >> b;

    char op;
    cout << "Enter Operation u want " << endl;
    cin >> op;
    
    switch( op ){

        case '+':
        cout << (a + b) << endl;
        break;
        case '-':
        cout << (a - b) << endl;
        break;
        case '*':
        cout << (a * b) << endl;
        break;
        case '%':
        cout << (a % b) << endl;
        break;
        case '/':
        cout << (a / b) << endl;
        break;
        default:
        cout << " Matsuda " << endl;
        break;

    }
    cout << endl;
}

