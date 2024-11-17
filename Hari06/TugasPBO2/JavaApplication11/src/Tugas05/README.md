---
# 📝 Aplikasi Penghitung Kata


Aplikasi Penghitung Kata ini adalah program **Java** berbasis GUI yang memungkinkan pengguna menghitung jumlah kata, karakter, kalimat, dan paragraf dalam teks yang dimasukkan. Aplikasi ini juga menyediakan fitur pencarian kata tertentu dan kemampuan untuk menyimpan teks beserta hasil perhitungan ke dalam file.



## 📜 Deskripsi Program

Aplikasi ini menyediakan beberapa fitur utama:
1. **Input Teks**: Menggunakan `JTextArea` yang dibungkus dalam `JScrollPane` agar pengguna dapat memasukkan teks panjang dengan mudah.
2. **Penghitungan Otomatis**: Setelah menekan tombol **"Hitung"**, aplikasi menampilkan jumlah kata, karakter, kalimat, dan paragraf pada `JLabel`.
3. **Pencarian Kata Spesifik**: Pengguna dapat mencari dan menghitung kemunculan kata tertentu dalam teks.
4. **Simpan Hasil**: Hasil perhitungan dapat disimpan ke dalam file untuk referensi di masa mendatang.

### Fitur Utama
- **Hitung Kata dan Karakter**: Menghitung jumlah kata dan karakter dalam teks.
- **Hitung Kalimat dan Paragraf**: Menghitung jumlah kalimat dan paragraf.
- **Pencarian Kata Tertentu**: Mencari kata tertentu dalam teks dan menampilkan jumlah kemunculannya.
- **Simpan Hasil ke File**: Menyimpan teks dan hasil perhitungan ke dalam file.

## 🛠️ Komponen GUI yang Digunakan

- **`JFrame`**: Frame utama aplikasi.
- **`JPanel`**: Panel untuk mengatur layout komponen.
- **`JLabel`**: Menampilkan hasil perhitungan seperti jumlah kata, karakter, kalimat, dan paragraf.
- **`JTextArea`**: Area teks untuk memasukkan paragraf yang akan dianalisis.
- **`JScrollPane`**: Membungkus `JTextArea` agar dapat menampilkan teks panjang.
- **`JButton`**: Tombol untuk memicu perhitungan (`Hitung`).

## ⚙️ Logika Program

Program ini menggunakan **manipulasi string dan ekspresi reguler** untuk menghitung kata, karakter, kalimat, dan paragraf. Berikut adalah alur logika utama:

1. **Perhitungan Kata dan Karakter**: Menggunakan metode `split()` untuk menghitung jumlah kata dan mengukur panjang string untuk karakter.
2. **Perhitungan Kalimat dan Paragraf**: Menggunakan ekspresi reguler untuk menghitung kalimat berdasarkan tanda titik (`.`) dan paragraf berdasarkan dua kali baris baru (`\n\n`).
3. **Pencarian Kata Tertentu**: Menggunakan ekspresi reguler untuk menemukan kemunculan kata tertentu dalam teks.
4. **Simpan Teks dan Hasil**: Menyimpan teks dan hasil perhitungan ke file menggunakan operasi file I/O.

## ⏳ Event-Handling

Aplikasi ini menggunakan beberapa event listeners untuk menangani interaksi pengguna:
- **`ActionListener` untuk tombol "Hitung"**: Menjalankan perhitungan ketika tombol **"Hitung"** ditekan.
- **`DocumentListener` pada `JTextArea`**: Menghitung secara real-time saat teks diubah.

## ✨ Variasi dan Fitur Tambahan

Aplikasi ini dilengkapi beberapa fitur tambahan:
- **Penghitungan Kalimat dan Paragraf**: Selain kata dan karakter, aplikasi ini menghitung kalimat dan paragraf.
- **Pencarian Kata Spesifik**: Menghitung kemunculan kata tertentu dalam teks.
- **Simpan Teks ke File**: Menyimpan teks beserta hasil perhitungan.

## 📚 Cara Menggunakan Aplikasi

1. **Jalankan aplikasi**.
2. **Masukkan teks** ke dalam `JTextArea`.
3. Tekan tombol **"Hitung"** untuk menghitung jumlah kata, karakter, kalimat, dan paragraf.
4. Gunakan fitur pencarian untuk mencari kata tertentu.
5. **Simpan hasil** perhitungan ke dalam file jika diinginkan.

## 💻 Instalasi dan Menjalankan Program

Pastikan **Java** sudah terinstal di sistem Anda. Ikuti langkah-langkah berikut:

1. **Download atau clone repository** ini ke mesin lokal Anda.
2. **Kompilasi** program dengan perintah berikut:
   ```bash
   javac PenghitungKataApp.java
   ```
3. **Jalankan** aplikasi dengan perintah:
   ```bash
   java PenghitungKataApp
   ```

## 📸 Screenshot Aplikasi

Berikut adalah tampilan antarmuka aplikasi Penghitung Kata:

![gambar](https://github.com/user-attachments/assets/576e87eb-4fc1-4467-999f-d41133885417)


> Gambar di atas menunjukkan tampilan aplikasi setelah pengguna memasukkan teks dan menekan tombol "Hitung".

## 👤 Penulis
- Nama: **Muhammad Adam Alghifari**
- NPM: **2210010314**
- Kelas: **5B Reguler Pagi BJB**

---

Selamat menggunakan aplikasi **Penghitung Kata**! 🎉


--- 

