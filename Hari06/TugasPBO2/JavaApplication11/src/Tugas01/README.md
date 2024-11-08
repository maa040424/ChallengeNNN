
# 📊 Aplikasi Cek Nomor Genap/Ganjil

Aplikasi ini adalah program **Java** yang memungkinkan pengguna untuk memeriksa apakah suatu angka merupakan **genap** atau **ganjil**. Dengan antarmuka pengguna grafis (GUI) berbasis Java Swing, aplikasi ini menyediakan pengalaman pengguna yang sederhana dan mudah digunakan.

---

## 📝 Deskripsi Program

Aplikasi ini menawarkan tampilan GUI yang terdiri dari beberapa komponen:
- **`JTextField`** untuk input angka dari pengguna.
- **`JButton`** untuk tombol "Cek".
- **`JLabel`** untuk menampilkan hasil cek nomor genap/ganjil beserta informasi tambahan.

### Fitur Utama:
1. **Validasi Input**: Program akan memeriksa apakah input dari pengguna valid.
2. **Cek Genap/Ganjil**: Menentukan apakah angka yang dimasukkan adalah genap atau ganjil.
3. **Pesan Error**: Jika input tidak valid, akan ditampilkan pesan error melalui **`JOptionPane`**.
4. **Cek Bilangan Prima**: Menentukan apakah angka tersebut adalah bilangan prima.
5. **Focus Listener**: Membersihkan **`JTextField`** saat mendapatkan fokus, agar pengguna dapat dengan mudah memasukkan angka baru.

---

## 🖥️ Komponen GUI yang Digunakan

Aplikasi ini menggunakan komponen-komponen dari **Java Swing**, yaitu:
- **`JFrame`**: Sebagai frame utama aplikasi.
- **`JPanel`**: Container untuk elemen-elemen UI lainnya.
- **`JLabel`**: Menampilkan hasil cek genap/ganjil dan informasi lainnya.
- **`JTextField`**: Tempat input angka oleh pengguna.
- **`JButton`**: Tombol untuk memulai proses cek angka.

---

## ⚙️ Logika Program

Logika yang digunakan dalam aplikasi mencakup:
- **Kondisional (if-else)**: Untuk menentukan apakah angka yang dimasukkan adalah genap atau ganjil.
- **Validasi Input**: Menggunakan `KeyAdapter` untuk membatasi input hanya berupa angka.
- **Cek Bilangan Prima**: Fungsi untuk memeriksa apakah angka tersebut adalah bilangan prima.

---

## ⏳ Event-Handling

Program ini menggunakan event listeners berikut:
- **`ActionListener`** pada tombol "Cek" untuk menangani klik dan menjalankan logika cek.
- **`KeyAdapter`** pada **`JTextField`** untuk membatasi input hanya berupa angka.
- **`FocusListener`** untuk membersihkan **`JTextField`** ketika mendapat fokus.

---

## 🚀 Fitur Tambahan

- **Cek Bilangan Prima**: Setelah menentukan genap atau ganjil, aplikasi juga memeriksa apakah angka tersebut adalah bilangan prima.
- **Pesan Error**: Menggunakan **`JOptionPane`** untuk menampilkan pesan hasil dan kesalahan (misal: input tidak valid).
- **FocusListener**: Fitur untuk membersihkan **`JTextField`** saat mendapatkan fokus agar pengguna dapat memasukkan angka baru dengan mudah.

---

## 📚 Cara Menggunakan Aplikasi

1. **Jalankan aplikasi**.
2. **Masukkan angka** pada **`JTextField`**.
3. Klik tombol **"Cek"** untuk memulai.
4. Hasil akan ditampilkan pada **`JLabel`**, menunjukkan apakah angka tersebut **genap** atau **ganjil**, dan juga apakah angka tersebut merupakan **bilangan prima**.

---

## 💻 Instalasi dan Jalankan Program

Pastikan Anda telah menginstal **Java** di sistem Anda, kemudian ikuti langkah-langkah berikut:

1. **Download atau clone repository ini** ke mesin lokal Anda.
2. **Kompilasi** program dengan perintah berikut di terminal:
   ```bash
   javac CekNomorGanjilGenap.java
   ```
3. **Jalankan** program menggunakan perintah:
   ```bash
   java CekNomorGanjilGenap
   ```

---

## 📸 Screenshot (Opsional)

Berikut adalah screenshot dari aplikasi:

![gambar](https://github.com/user-attachments/assets/8ae8b6dc-b297-4e96-b703-d94983468d30)


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


