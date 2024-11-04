#include <iostream>
using namespace std;

bool isPrima(int n)
{
    if (n <= 1)
        return false;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

int main()
{
    int angka;
    cout << "Masukkan sebuah angka: ";
    cin >> angka;

    if (isPrima(angka))
        cout << angka << " adalah bilangan prima." << endl;
    else
        cout << angka << " bukan bilangan prima." << endl;

    return 0;
}
