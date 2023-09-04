// #include <iostream>
// using namespace std;


// int main() {
//     int amount;
//     int Rs100 = 0, Rs50 = 0, Rs20 = 0, Rs1 = 0;

//     cout << "Enter amount: ";
//     cin >> amount;

//     // Calculate the number of each denomination
//     Rs100 = amount / 100;512
//     amount = amount % 100;

//     Rs50 = amount / 50;
//     amount = amount % 50;

//     Rs20 = amount / 20;
//     amount = amount % 20;

//     Rs1 = amount;

//     // Display the results
//     cout << "Total no. of notes of 100 : " << Rs100 << endl;
//     cout << "Total no. of notes of 50  : " << Rs50 << endl;
//     cout << "Total no. of notes of 20  : " << Rs20 << endl;
//     cout << "Total no. of notes of 1   : " << Rs1 << endl;

//     return 0;
// }




#include <iostream>
using namespace std;

int main() {
    int amount;
    int Rs100 = 0, Rs50 = 0, Rs20 = 0, Rs1 = 0;

    cout << "Enter amount: ";
    cin >> amount;

    while (amount > 0) {
        switch (amount) {
            case 100:
                Rs100++;
                amount -= 100;
                break;
            case 50:
                Rs50++;
                amount -= 50;
                break;
            case 20:
                Rs20++;
                amount -= 20;
                break;
            case 1:
                Rs1++;
                amount -= 1;
                break;
            default:
                cout << "Invalid amount: " << amount << endl;
                return 1; // Exit the program with an error code
        }
    }

    // Display the results
    cout << "Total no. of notes of 100 : " << Rs100 << endl;
    cout << "Total no. of notes of 50  : " << Rs50 << endl;
    cout << "Total no. of notes of 20  : " << Rs20 << endl;
    cout << "Total no. of notes of 1   : " << Rs1 << endl;

    return 0;
}


