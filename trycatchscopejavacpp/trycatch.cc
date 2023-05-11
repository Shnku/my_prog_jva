#include <iostream>
using namespace std;

int main()
{
    int a, b;
    try
    {
        cout << "\nenter values of a & b: ";
        cin >> a >> b;

        throw;
    }
    catch (const std::exception &e)
    {
        std::cerr << e.what() << '\n';
    }

    cout << "\nthe a= " << a << "\tb= " << b;

    return 0;
}
