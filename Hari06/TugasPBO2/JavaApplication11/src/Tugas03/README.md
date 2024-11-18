# 💸 Aplikasi Perhitungan Diskon


Aplikasi ini adalah program **Java** yang memudahkan pengguna dalam menghitung harga akhir setelah diskon dan mengestimasi penghematan berdasarkan harga asli dan persentase diskon. Dengan antarmuka pengguna grafis (GUI) berbasis **Java Swing**, aplikasi ini menawarkan kemudahan bagi pengguna untuk memasukkan harga, memilih diskon, dan mendapatkan hasil secara langsung.

---

## 📝 Deskripsi Program

Aplikasi ini memungkinkan pengguna untuk:
1. **Memasukkan harga asli** produk.
2. **Memilih persentase diskon** untuk menghitung total harga setelah diskon.
3. **Menghitung harga akhir** serta **jumlah penghematan** yang diperoleh.

Setelah pengguna memilih persentase diskon dan memasukkan harga asli, hasil perhitungan akan ditampilkan setelah tombol **"Hitung"** ditekan.

### Fitur Utama:
- **Memilih Persentase Diskon**: Menggunakan **`JComboBox`** untuk memilih persentase diskon atau **`JSlider`** sebagai alternatif.
- **Penanganan Input**: Memastikan input hanya berupa angka dan menampilkan pesan error jika input tidak valid.
- **Riwayat Perhitungan**: Aplikasi menyimpan riwayat perhitungan diskon untuk referensi pengguna.

---

## 🖥️ Komponen GUI yang Digunakan

Aplikasi ini menggunakan berbagai komponen **Java Swing** untuk membangun antarmuka pengguna, yaitu:
- **`JFrame`**: Sebagai frame utama aplikasi.
- **`JPanel`**: Untuk mengelompokkan elemen-elemen antarmuka pengguna.
- **`JLabel`**: Untuk menampilkan teks, instruksi, dan hasil perhitungan.
- **`JTextField`**: Untuk input harga asli.
- **`JComboBox`**: Untuk memilih persentase diskon yang diinginkan.
- **`JButton`**: Tombol untuk memulai proses perhitungan diskon.
- **`JSlider`** (opsional): Alternatif untuk memilih persentase diskon.
  
---

## ⚙️ Logika Program

Aplikasi ini memiliki logika perhitungan dan validasi input yang meliputi:
1. **Perhitungan Diskon**: Menghitung harga akhir dengan rumus:
   ```
   Harga Akhir = Harga Asli - (Harga Asli × Persentase Diskon / 100)
   Penghematan = Harga Asli - Harga Akhir
   ```
2. **Penanganan Eksepsi**: Menangani eksepsi seperti input kosong, karakter non-numerik, atau kesalahan kalkulasi.

---

## ⏳ Event-Handling

Aplikasi ini menggunakan beberapa event listeners untuk menangani interaksi pengguna:
- **`ActionListener`** untuk tombol **"Hitung"**: Memulai perhitungan diskon saat tombol diklik dan menampilkan hasilnya.
- **`ItemListener`** pada **`JComboBox`**: Menangani pilihan persentase diskon.
- **`ChangeListener`** untuk **`JSlider`** (opsional): Mengizinkan pengguna mengubah persentase diskon menggunakan slider dan melihat perubahan hasil secara real-time.

---

## 🚀 Fitur Tambahan

- **Kode Kupon Diskon Tambahan**: Menyediakan opsi tambahan bagi pengguna untuk memasukkan kode kupon yang memberikan diskon ekstra.
- **JSlider untuk Pilihan Diskon**: Sebagai alternatif **`JComboBox`**, pengguna bisa memilih persentase diskon dengan **`JSlider`**.
- **Riwayat Perhitungan Diskon**: Aplikasi menyimpan riwayat perhitungan diskon yang telah dilakukan, memungkinkan pengguna melihat histori transaksi.

---

## 📚 Cara Menggunakan Aplikasi

1. **Jalankan aplikasi**.
2. **Masukkan harga asli** pada **`JTextField`**.
3. Pilih **persentase diskon** dari **`JComboBox`** atau **`JSlider`**.
4. Klik tombol **"Hitung"** untuk melihat harga akhir setelah diskon dan jumlah penghematan.
5. Hasil perhitungan akan ditampilkan pada **`JLabel`**, dan riwayat perhitungan akan diperbarui.

---

## 💻 Instalasi dan Jalankan Program

Pastikan **Java** sudah terinstal di sistem Anda, dan ikuti langkah-langkah berikut:

1. **Download atau clone repository** ini ke komputer Anda.
2. **Kompilasi** program dengan perintah berikut:
   ```bash
   javac PerhitunganDiskon.java
   ```
3. **Jalankan program**:
   ```bash
   java PerhitunganDiskon
   ```

---

## 📸 Screenshot

![gambar](https://github.com/user-attachments/assets/5527e147-046f-4f9e-a056-dd617a31f405)


---

## 📜 Lisensi

Aplikasi ini dirancang untuk tujuan pembelajaran dan bersifat **open-source**. Anda bebas untuk memodifikasi dan mendistribusikan aplikasi ini sesuai kebutuhan.

---

## 👨‍💻 Penulis

- **Nama Penulis**: Muhammad Adam Alghifari
- **NPM**: 2210010314
- **Kelas**: 5B BJB Reguler Pagi
- **Kontak**: alghifarimadam04@gmail.com


