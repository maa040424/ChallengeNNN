# Aplikasi Keuangan Pribadi

![Finance Icon](https://img.icons8.com/color/48/money.png)  
Aplikasi ini dirancang untuk membantu pengguna dalam mengelola keuangan pribadi, mencatat pemasukan, pengeluaran, serta menghasilkan laporan keuangan.

## Fitur Utama

- **Tambah Transaksi**: Input data pemasukan dan pengeluaran Anda.
- **Riwayat Transaksi**: Lihat daftar transaksi Anda yang telah dilakukan, lengkap dengan pemisah yang jelas.
- **Laporan Keuangan**: Ekspor laporan keuangan ke dalam format CSV untuk digunakan lebih lanjut.
- **Impor Data**: Impor data dari file CSV untuk memperbarui tabel transaksi Anda.
- **Filter Pencarian**: Cari transaksi berdasarkan jenis atau deskripsi.

## Teknologi yang Digunakan

- **Bahasa Pemrograman**: Java
- **Antarmuka Pengguna**: Swing
- **Penyimpanan Data**: Database SQLite (dikelola melalui `KoneksiDB`)

## Cara Menggunakan

1. **Tambah Transaksi**:
   - Pilih jenis transaksi (Pemasukan/Pengeluaran).
   - Masukkan deskripsi dan nominal transaksi.
   - Klik `Add Transaction` untuk menyimpan.

2. **Ekspor Laporan**:
   - Klik tombol `Ekspor`.
   - Pilih lokasi dan simpan file CSV Anda.

3. **Impor Laporan**:
   - Klik tombol `Impor`.
   - Pilih file CSV yang ingin diimpor.
   - Data akan diperbarui ke dalam aplikasi.

4. **Filter Pencarian**:
   - Ketik kata kunci di kolom pencarian untuk menyaring data di tabel laporan.

5. **Hapus Transaksi**:
   - Pilih baris transaksi di tabel laporan.
   - Klik tombol `Hapus`.

## Struktur File

- `AplikasiKeuanganPribadiForm.java`: Berfungsi sebagai halaman utama aplikasi.
- `LaporanForm.java`: Berfungsi untuk menampilkan laporan dan melakukan ekspor/impor data CSV.
- `RiwayatForm.java`: Menampilkan riwayat transaksi dengan pemisah antar transaksi.
- `Transaction.java`: Berisi logika untuk pengelolaan data transaksi, termasuk operasi ke database.

## Screenshot

### Halaman Utama
![gambar](https://github.com/user-attachments/assets/75159501-25e4-4900-ac14-b4cee398c3da)


### Riwayat Transaksi
![gambar](https://github.com/user-attachments/assets/03f3997c-d949-4ba5-b621-80e56252990e)


### Laporan Keuangan
![gambar](https://github.com/user-attachments/assets/0bceb28f-b3c4-40e8-93e5-ecb65a4ec616)


> **Catatan**: Simpan tangkapan layar aplikasi Anda di folder `screenshots` di direktori proyek untuk memastikan referensi gambar ini dapat diakses.

## Penulis

- **Nama**: [Masukkan Nama Anda]
- **NPM**: [Masukkan NPM Anda]

---

Dukungan Ikon:  
- [Icons8](https://icons8.com)
