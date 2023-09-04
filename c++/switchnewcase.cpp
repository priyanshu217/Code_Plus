#include <iostream>
using namespace std;

int main()
{

    while (1)
    {
        int a = 1;
        char ch = '2';

        switch (a)
        {
        case 1:
            switch (ch)
            {
            case 2:
                cout << "newbe" << endl;
                break;

            default:
                cout << "noop" << endl;
                break;
            }
            cout << " first" << endl;
            break;

        case '2':
            cout << " second " << endl;
            break;

        default:
            cout << "Nothing Here" << endl;
            break;
        }
        cout << endl;
        break;
        
    }
}