# Aplikasi Pengelolaan Kontak 📱

## Deskripsi Program 📝

Aplikasi Pengelolaan Kontak ini memungkinkan pengguna untuk menyimpan, mengelola, dan mengorganisir informasi kontak. Pengguna dapat menambahkan, mengedit, dan menghapus kontak yang tersimpan di database SQLite. Kontak dapat dikelompokkan berdasarkan kategori seperti **Keluarga**, **Teman**, atau **Kerja** yang dipilih melalui **JComboBox**.

### Fitur Utama 🔧:
- Menyimpan informasi kontak seperti **nama**, **nomor telepon**, dan **kategori** ke dalam database SQLite.
- Pengguna dapat melakukan **CRUD** (Create, Read, Update, Delete) terhadap data kontak yang disimpan.
- Menyediakan kemampuan untuk mencari kontak berdasarkan **nama** atau **nomor telepon** dan menampilkan hasilnya di **JTable**.
- Validasi input untuk memastikan nomor telepon hanya berisi angka dan memiliki panjang yang sesuai.
- Menyediakan fitur untuk mengekspor daftar kontak ke file **CSV** dan mengimpor kontak dari file **CSV** ke database.

---

## Komponen GUI 🖥️

Aplikasi ini menggunakan komponen GUI berikut:

- **JFrame**: Sebagai jendela utama aplikasi.
- **JPanel**: Untuk mengelompokkan dan mengatur komponen GUI.
- **JLabel**: Untuk menampilkan label teks.
- **JTextField**: Untuk input teks, seperti nama dan nomor telepon.
- **JButton**: Untuk tombol aksi seperti Tambah, Edit, Hapus, dan Cari.
- **JList**: Untuk menampilkan daftar kontak yang dipilih.
- **JComboBox**: Untuk memilih kategori kontak (Keluarga, Teman, Kerja).
- **JTable**: Untuk menampilkan daftar kontak yang tersimpan.
- **JScrollPane**: Untuk menyediakan kemampuan scroll pada **JTable** dan **JList**.

---

## Screenshot 📸

Berikut adalah tampilan aplikasi **Aplikasi Pengelolaan Kontak**:

![gambar](https://github.com/user-attachments/assets/6b388f67-af22-4369-b958-95a1baf4fc3d)


> *Gambar di atas menunjukkan tampilan utama aplikasi, dengan daftar kontak yang terkelompok dalam kategori tertentu, serta form untuk menambah dan mengedit kontak.*

---

## Logika Program 🔄

- **Database SQLite**: Digunakan untuk menyimpan data kontak secara lokal.
- **CRUD (Create, Read, Update, Delete)**: Fitur utama untuk mengelola data kontak yang tersimpan.
- **Validasi Input**: Memastikan nomor telepon yang dimasukkan hanya berisi angka dan panjangnya sesuai.
- **Ekspor dan Impor CSV**: Fitur untuk mengekspor dan mengimpor data kontak dari dan ke file CSV.

---

## Event Handling ⚙️

- **ActionListener**: Digunakan untuk menangani aksi pada tombol **Tambah**, **Edit**, **Hapus**, dan **Cari Kontak**.
- **ItemListener**: Digunakan untuk menangani perubahan kategori kontak yang dipilih melalui **JComboBox**.

---

## Variasi dan Fitur Tambahan 🎉

- **Pencarian Kontak**: Pengguna dapat mencari kontak berdasarkan nama atau nomor telepon. Hasil pencarian ditampilkan di **JTable**.
- **Validasi Input Nomor Telepon**: Pastikan nomor telepon yang dimasukkan hanya berisi angka dan memiliki panjang yang sesuai dengan standar nomor telepon.
- **Ekspor ke CSV**: Daftar kontak dapat diekspor ke file CSV untuk digunakan di aplikasi lain seperti Microsoft Excel.
- **Impor dari CSV**: Kontak yang ada dalam file CSV dapat diimpor dan ditambahkan ke dalam database aplikasi.

---

## Cara Menggunakan 📖

1. **Menambah Kontak** ➕:
   - Masukkan nama, nomor telepon, dan pilih kategori menggunakan **JComboBox**.
   - Klik tombol **Tambah** untuk menyimpan kontak ke database.

2. **Mengedit Kontak** ✏️:
   - Pilih kontak yang ingin diedit dari daftar.
   - Edit informasi kontak dan klik tombol **Edit** untuk memperbarui data.

3. **Menghapus Kontak** ❌:
   - Pilih kontak yang ingin dihapus.
   - Klik tombol **Hapus** untuk menghapus kontak dari database.

4. **Mencari Kontak** 🔍:
   - Gunakan kolom pencarian untuk mencari kontak berdasarkan nama atau nomor telepon.
   - Klik tombol **Cari** untuk menampilkan hasil pencarian di **JTable**.

5. **Ekspor Kontak ke CSV** 📤:
   - Klik tombol **Ekspor** untuk menyimpan daftar kontak ke file CSV.

6. **Impor Kontak dari CSV** 📥:
   - Klik tombol **Impor** untuk mengimpor daftar kontak dari file CSV ke aplikasi.

---

## Penulis ✍️

Nama: **Muhammad Adam Alghifari**  
NPM: **2210010314**  
Email: [alghifarimadam04@gmail.com](mailto:alghifarimadam04@gmail.com)

---

## Teknologi yang Digunakan 💻

- **Java**: Bahasa pemrograman utama untuk aplikasi.
- **SQLite**: Database lokal untuk menyimpan data kontak.
- **Netbeans**: Untuk pembuatan antarmuka grafis (GUI).
- **CSV**: Untuk fitur ekspor dan impor data kontak.
  

---

## Lisensi 📜

Belum ada lisensinya hehehe
