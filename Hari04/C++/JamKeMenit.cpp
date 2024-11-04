#include <iostream>
using namespace std;

int main()
{
    int totalDetik, jam, menit, detik;

    cout << "Masukkan jumlah detik: ";
    cin >> totalDetik;

    jam = totalDetik / 3600;
    totalDetik %= 3600;
    menit = totalDetik / 60;
    detik = totalDetik % 60;

    cout << "Waktu: " << jam << " jam, " << menit << " menit, " << detik << " detik." << endl;
    return 0;
}
