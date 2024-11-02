#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    double radius, luas, keliling;
    cout << "Masukkan jari-jari Lingkaran: ";
    cin >> radius;

    luas = M_PI * pow(radius, 2);
    keliling = 2 * M_PI * radius;

    cout << " Luas : " << luas << endl;
    cout << "Keliling : " << keliling << endl;
    return 0;
}