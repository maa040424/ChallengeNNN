Berikut adalah **README.md** yang dirancang untuk aplikasi **Konversi Suhu**:

```markdown
# 🌡️ Aplikasi Konversi Suhu

Aplikasi ini adalah program **Java** yang memungkinkan pengguna untuk mengkonversi nilai suhu dari satu skala ke skala lainnya, seperti dari **Celcius** ke **Fahrenheit**, **Reamur**, dan **Kelvin**. Aplikasi ini menyediakan antarmuka pengguna grafis (GUI) yang sederhana menggunakan komponen-komponen Java Swing.

---

## 📝 Deskripsi Program

Aplikasi ini memungkinkan pengguna untuk:
1. **Memasukkan nilai suhu** ke dalam input field.
2. **Memilih jenis konversi** (misalnya Celcius ke Fahrenheit, Celcius ke Reamur, dll).
3. Setelah memilih konversi, pengguna dapat menekan tombol **"Konversi"** untuk melihat hasil konversi dari suhu yang dimasukkan.

### Fitur Utama:
- **Pemilihan Jenis Konversi**: Pengguna dapat memilih jenis konversi suhu menggunakan **`JComboBox`** dan **`JRadioButton`**.
- **Validasi Input**: Program memvalidasi agar input hanya menerima angka.
- **Hasil Konversi**: Menampilkan hasil konversi suhu setelah tombol ditekan.
- **Konversi Otomatis**: Mengonversi suhu secara otomatis saat nilai input berubah.

---

## 🖥️ Komponen GUI yang Digunakan

Aplikasi ini menggunakan beberapa komponen dari **Java Swing** untuk membuat antarmuka pengguna:
- **`JFrame`**: Sebagai frame utama aplikasi.
- **`JPanel`**: Sebagai container untuk komponen UI lainnya.
- **`JLabel`**: Untuk menampilkan hasil konversi suhu.
- **`JTextField`**: Untuk input nilai suhu.
- **`JComboBox`**: Untuk memilih jenis konversi suhu (Celcius, Fahrenheit, Reamur, Kelvin).
- **`JRadioButton`**: Untuk memilih arah konversi (misalnya Celcius ke Fahrenheit atau sebaliknya).
- **`JButton`**: Tombol untuk memulai proses konversi.

---

## ⚙️ Logika Program

Aplikasi ini mengimplementasikan beberapa rumus konversi suhu antara skala yang berbeda:
- **Celcius ke Fahrenheit**: `F = (C × 9/5) + 32`
- **Celcius ke Reamur**: `R = C × 4/5`
- **Celcius ke Kelvin**: `K = C + 273.15`
- **Fahrenheit ke Celcius**: `C = (F - 32) × 5/9`
- **Reamur ke Celcius**: `C = R × 5/4`
- **Kelvin ke Celcius**: `C = K - 273.15`

Logika program juga mencakup validasi input agar hanya angka yang diterima, serta konversi otomatis saat nilai input berubah.

---

## ⏳ Event-Handling

Program ini menggunakan event listeners untuk menangani interaksi pengguna:
- **`ActionListener`** untuk tombol **"Konversi"**: Menangani klik tombol dan melakukan konversi berdasarkan input dan pilihan pengguna.
- **`KeyAdapter`** pada **`JTextField`**: Membatasi input hanya berupa angka untuk mencegah kesalahan saat pengguna memasukkan data.
- **`ItemListener`** pada **`JRadioButton`**: Memungkinkan pengguna untuk memilih arah konversi (misalnya Celcius ke Fahrenheit atau sebaliknya).
- **Konversi Otomatis**: Menggunakan event listener pada **`JTextField`** untuk melakukan konversi secara otomatis saat nilai input berubah.

---

## 🚀 Fitur Tambahan

- **Skala Suhu Lain**: Selain konversi antara Celcius dan Fahrenheit, aplikasi ini juga mendukung konversi ke **Reamur** dan **Kelvin**.
- **Konversi Otomatis**: Nilai suhu akan langsung dikonversi ketika input berubah tanpa perlu menekan tombol **"Konversi"**.
- **ItemListener** pada **`JRadioButton`**: Menambahkan kemampuan untuk memilih arah konversi suhu (misalnya dari Celcius ke Fahrenheit atau sebaliknya).
- **Pesan Error**: Jika input tidak valid, aplikasi akan memberikan feedback melalui pesan kesalahan.

---

## 📚 Cara Menggunakan Aplikasi

1. **Jalankan aplikasi**.
2. **Masukkan nilai suhu** pada **`JTextField`**.
3. Pilih jenis konversi suhu menggunakan **`JComboBox`** atau pilih arah konversi dengan **`JRadioButton`**.
4. Klik tombol **"Konversi"** untuk melihat hasilnya.
5. Hasil konversi akan ditampilkan di **`JLabel`** setelah tombol diklik.

Aplikasi juga dapat mengonversi suhu secara otomatis saat nilai input berubah.

---

## 💻 Instalasi dan Jalankan Program

Untuk menjalankan aplikasi ini, pastikan **Java** sudah terinstal di sistem Anda, dan ikuti langkah-langkah berikut:

1. **Download atau clone repository** ke mesin lokal Anda.
2. **Kompilasi** program dengan perintah berikut:
   ```bash
   javac KonversiSuhu.java
   ```
3. **Jalankan** program dengan perintah:
   ```bash
   java KonversiSuhu
   ```

---

## 📸 Screenshot (Opsional)

Berikut adalah screenshot dari aplikasi:

![WhatsApp Image 2024-11-08 at 11 01 35_9d5ea073](https://github.com/user-attachments/assets/e8820896-f605-4bc0-ae44-3263420adc7b)


---

## 📜 Lisensi

Aplikasi ini dibuat untuk tujuan **pembelajaran** dan bersifat **open-source**. Anda bebas untuk memodifikasi dan mendistribusikan ulang aplikasi ini sesuai dengan kebutuhan Anda.

---

## ✍️ Penulis

- **Nama**: Muhammad Adam Alghifari
- **NPM**: 2210010314
- **Kelas**: 5B BJB Reguler Pagi
- **Kontak**: [alghifarimadam04@gmail.com](mailto:alghifarimadam04@gmail.com)

---

Terima kasih telah menggunakan aplikasi ini! Jika Anda menemukan bug atau memiliki saran, silakan buka **Issue** di repositori ini.

```

### Penjelasan Perubahan:

1. **Ikon dan Heading**: Penambahan emoji di bagian judul dan heading untuk menambah daya tarik dan keterbacaan.
2. **Penataan yang Lebih Rapi**: Menggunakan pemisah yang lebih jelas antara bagian deskripsi, fitur, cara penggunaan, dan instalasi untuk kemudahan navigasi.
3. **Instruksi yang Lebih Detail**: Memberikan instruksi lebih lengkap untuk memandu pengguna dalam menjalankan aplikasi.
4. **Penambahan Fitur dan Event-Handling**: Penjelasan tentang event listeners dan fitur tambahan seperti konversi otomatis saat nilai input berubah.
