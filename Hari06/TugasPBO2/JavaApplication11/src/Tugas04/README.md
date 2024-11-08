

---

# 📅 Aplikasi Perhitungan Hari

Aplikasi ini adalah program **Java** berbasis GUI yang memungkinkan pengguna untuk menghitung jumlah hari dalam bulan tertentu dan menampilkan informasi tambahan seperti hari pertama dan terakhir dalam bulan tersebut, serta selisih hari dari tanggal tertentu hingga akhir bulan. Aplikasi ini menggunakan **Java Swing** dan komponen **JCalendar**.

## 📜 Deskripsi Program

Aplikasi ini memungkinkan pengguna untuk:
1. **Memilih bulan** dari `JComboBox` dan **memasukkan tahun** menggunakan `JSpinner`.
2. **Menghitung jumlah hari** dalam bulan yang dipilih.
3. Menampilkan informasi tambahan seperti **hari pertama** dan **hari terakhir** dari bulan yang dipilih, serta informasi **tahun kabisat**.
4. **Menghitung selisih hari** antara tanggal yang dipilih di `JCalendar` dengan akhir bulan.

### Fitur Utama
- **Penghitungan Hari dalam Bulan**: Menampilkan jumlah hari dalam bulan yang dipilih.
- **Tahun Kabisat**: Menentukan apakah tahun yang dipilih adalah tahun kabisat.
- **Informasi Hari Pertama dan Terakhir**: Menampilkan nama hari pada tanggal pertama dan terakhir dalam bulan tersebut.
- **Selisih Hari**: Menghitung jumlah hari antara tanggal yang dipilih dengan tanggal terakhir bulan tersebut.
- **Clear Button**: Tombol untuk menghapus hasil perhitungan yang ditampilkan.

## 🛠️ Komponen GUI yang Digunakan

- **`JFrame`**: Frame utama aplikasi.
- **`JPanel`**: Container untuk mengatur layout komponen.
- **`JLabel`**: Menampilkan label dan instruksi untuk pengguna.
- **`JComboBox`**: Menampilkan daftar nama bulan untuk dipilih.
- **`JSpinner`**: Memungkinkan pengguna memasukkan tahun.
- **`JCalendar`**: Komponen kalender untuk memilih tanggal.
- **`JButton`**: Tombol untuk memulai perhitungan (`Hitung`) dan tombol untuk menghapus hasil (`Clear`).
- **`JTextArea`**: Area teks yang menampilkan hasil perhitungan.

## ⚙️ Logika Program

Aplikasi ini menggunakan **Java API Tanggal (LocalDate)** untuk menghitung jumlah hari dalam bulan yang dipilih dan menghitung tahun kabisat. Berikut adalah logika programnya:

1. **Perhitungan Hari dalam Bulan**: Menggunakan `YearMonth.of(tahun, bulan).lengthOfMonth()` untuk menghitung jumlah hari dalam bulan.
2. **Penentuan Hari Pertama dan Terakhir**: Mengambil tanggal pertama (`LocalDate.of(tahun, bulan, 1)`) dan terakhir dalam bulan yang dipilih.
3. **Cek Tahun Kabisat**: Menggunakan `Year.isLeap(tahun)` untuk menentukan apakah tahun tersebut adalah kabisat.
4. **Perhitungan Selisih Hari**: Menggunakan `ChronoUnit.DAYS.between()` untuk menghitung jumlah hari antara tanggal yang dipilih di `JCalendar` dan akhir bulan.

## ⏳ Event-Handling

Aplikasi ini menggunakan beberapa event listeners untuk menangani interaksi pengguna:
- **`ActionListener`** untuk tombol **"Hitung"**: Menjalankan proses perhitungan berdasarkan input bulan, tahun, dan tanggal yang dipilih.
- **`ChangeListener`** pada **`JSpinner`**: Mengambil input tahun dari pengguna.
- **`ActionListener`** untuk tombol **"Clear"**: Menghapus teks yang ditampilkan pada `JTextArea`.

## 📚 Cara Menggunakan Aplikasi

1. **Jalankan aplikasi**.
2. **Pilih bulan** menggunakan `JComboBox` dan **masukkan tahun** di `JSpinner`.
3. **Pilih tanggal** menggunakan `JCalendar`.
4. Klik tombol **"Hitung"** untuk melihat hasilnya.
5. **Hasil perhitungan** akan ditampilkan di `JTextArea`, yang mencakup jumlah hari, hari pertama dan terakhir, status tahun kabisat, serta selisih hari hingga akhir bulan.
6. Untuk **menghapus hasil**, klik tombol **"Clear"**.

## 💻 Instalasi dan Jalankan Program

Pastikan **Java** sudah terinstal di sistem Anda. Ikuti langkah-langkah berikut untuk menjalankan aplikasi:

1. **Download atau clone repository** ke mesin lokal Anda.
2. **Kompilasi** program dengan perintah berikut:
   ```bash
   javac PerhitunganHariApp.java
   ```
3. **Jalankan** aplikasi dengan perintah:
   ```bash
   java PerhitunganHariApp
   ```

## 🧑‍💻 Penulis
- Nama: **Muhammad Adam Alghifari**
- NPM: **2210010314**
- Kelas: **5B Reguler Pagi BJB**

---

Selamat menggunakan aplikasi **Perhitungan Hari**! 🎉
