#include <iostream>
using namespace std;

double kalkulator(double a, double b, char oper)
{
    switch (oper)
    {
    case '+':
        return a + b;
    case '-':
        return a - b;
    case '*':
        return a * b;
    case '/':
        return a / b;
    default:
        cout << "Operator tidak valid";
        return 0;
    }
}

int main()
{
    double num1, num2;
    char oper;
    cout << "Masukkan angka pertama: ";
    cin >> num1;
    cout << "Masukkan operator (+, -, *, /): ";
    cin >> oper;
    cout << "Masukkan angka kedua: ";
    cin >> num2;
    cout << "Hasil: " << kalkulator(num1, num2, oper) << endl;
    return 0;
}
