
```markdown
# Panduan Menggunakan SFML dengan Dev-C++

Dokumen ini menjelaskan langkah-langkah untuk mengatur dan menggunakan SFML (Simple and Fast Multimedia Library) dalam proyek C++ menggunakan Dev-C++.

## Langkah 1: Unduh SFML

1. Kunjungi halaman resmi [SFML](https://www.sfml-dev.org/download.php).
2. Pilih versi Windows dan unduh file ZIP yang sesuai dengan compiler yang kamu gunakan (misalnya, untuk MinGW, pilih versi yang berlabel "GCC").
3. Ekstrak file ZIP ke direktori pilihan, misalnya:
   ```
   E:\ChallengeNNN\Hari05\SFML-2.6.1-windows-vc17-64-bit\SFML-2.6.1
   ```

## Langkah 2: Siapkan Proyek di Dev-C++

1. Buka Dev-C++ dan buat proyek baru:
   - Pilih **File** > **New** > **Project**.
   - Pilih **C++ Project** dan beri nama, misalnya `SFMLExample`.

2. Tambahkan kode berikut ke dalam file `main.cpp`:

   ```cpp
   #include <SFML/Graphics.hpp>

   int main() {
       // Membuat jendela dengan ukuran 800x600 dan judul "Contoh Grafik dengan SFML"
       sf::RenderWindow window(sf::VideoMode(800, 600), "Contoh Grafik dengan SFML");

       // Membuat lingkaran dengan radius 50 piksel
       sf::CircleShape circle(50);
       circle.setFillColor(sf::Color::Green); // Mengatur warna lingkaran
       circle.setPosition(100, 100); // Mengatur posisi awal lingkaran

       // Kecepatan pergerakan lingkaran
       float speed = 0.1;

       // Loop utama
       while (window.isOpen()) {
           sf::Event event;
           while (window.pollEvent(event)) {
               if (event.type == sf::Event::Closed)
                   window.close();
           }

           // Memindahkan lingkaran ke kanan
           circle.move(speed, 0);

           // Membersihkan layar
           window.clear(sf::Color::Black);

           // Menggambar lingkaran
           window.draw(circle);

           // Menampilkan ke layar
           window.display();
       }

       return 0;
   }
   ```

## Langkah 3: Konfigurasi Proyek untuk SFML

1. Pilih **Tools** > **Compiler Options**.
2. Tambahkan direktori berikut:
   - Untuk **C++ Includes**:
     ```
     E:\ChallengeNNN\Hari05\SFML-2.6.1-windows-vc17-64-bit\SFML-2.6.1\include
     ```
   - Untuk **Libraries**:
     ```
     E:\ChallengeNNN\Hari05\SFML-2.6.1-windows-vc17-64-bit\SFML-2.6.1\lib
     ```

3. Untuk menambahkan library saat mengompilasi, gunakan:
   ```
   -lsfml-graphics -lsfml-window -lsfml-system
   ```

   Jika menggunakan versi debug, tambahkan `-d` di belakang nama library:
   ```
   -lsfml-graphics-d -lsfml-window-d -lsfml-system-d
   ```

## Langkah 4: Salin File DLL

1. Salin file DLL dari folder `bin` SFML ke direktori yang sama dengan file `.exe` hasil kompilasi.
   - Salin file berikut dari `E:\ChallengeNNN\Hari05\SFML-2.6.1-windows-vc17-64-bit\SFML-2.6.1\bin`:
     - `sfml-graphics-2.dll`
     - `sfml-window-2.dll`
     - `sfml-system-2.dll`

## Langkah 5: Kompilasi dan Jalankan

1. Klik **Execute** > **Compile & Run** atau tekan `F9` untuk mengkompilasi dan menjalankan program.

Jika semua langkah di atas dilakukan dengan benar, jendela dengan lingkaran hijau akan muncul dan bergerak ke kanan. Jika ada masalah atau kesalahan yang muncul, silakan periksa kembali pengaturan atau beri tahu untuk mendapatkan bantuan lebih lanjut.
```

