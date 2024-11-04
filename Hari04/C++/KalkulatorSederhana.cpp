#include <iostream>
using namespace std;

int main()
{
    char operasi;
    double num1, num2, hasil;

    cout << "Masukkan operator (+, -, *, /): ";
    cin >> operasi;

    cout << "Masukkan dua angka: ";
    cin >> num1 >> num2;

    switch (operasi)
    {
    case '+':
        hasil = num1 + num2;
        break;
    case '-':
        hasil = num1 - num2;
        break;
    case '*':
        hasil = num1 * num2;
        break;
    case '/':
        if (num2 != 0)
        {
            hasil = num1 / num2;
        }
        else
        {
            cout << "Error: Pembagian dengan nol!" << endl;
            return 1;
