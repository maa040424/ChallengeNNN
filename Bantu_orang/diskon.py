# Input total belanja dari pengguna
total_belanja = float(input("Masukkan total belanja Anda: Rp. "))

# Inisialisasi diskon
diskon = 0

# Menentukan diskon berdasarkan total belanja
if total_belanja < 150000:
    diskon = 0  # Tidak ada diskon
elif 150000 <= total_belanja <= 500000:
    diskon = 0.1  # Diskon 10%
elif 500000 < total_belanja <= 1000000:
    diskon = 0.15  # Diskon 15%
else:
    diskon = 0.2  # Diskon 20%

# Menghitung jumlah diskon yang diberikan
jumlah_diskon = total_belanja * diskon

# Menghitung harga yang harus dibayar setelah diskon
harga_setelah_diskon = total_belanja - jumlah_diskon

# Menampilkan hasil
print(f"Total belanja: Rp. {total_belanja}")
print(f"Diskon: {diskon * 100}%")
print(f"Jumlah diskon: Rp. {jumlah_diskon}")
print(f"Harga yang harus dibayar setelah diskon: Rp. {harga_setelah_diskon}")
