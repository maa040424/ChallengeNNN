# latihan3_1_6.py


masa_kerja = int(input("Masukkan masa kerja (tahun): "))
status_pegawai = input("Apakah Anda pegawai tetap? (ya/tidak): ").lower()
status_keluarga = input("Apakah Anda sudah berkeluarga? (ya/tidak): ").lower()
gaji_pokok = float(input("Masukkan gaji pokok: "))

nama = "Aldino";
npm = "2410010000";
praktikum = "praktikum anu";



bonus = 0
if masa_kerja > 5:
    bonus = 0.15 * gaji_pokok


uang_transport = 0
if status_pegawai == "ya":
    uang_transport = 50000


tunjangan = 0
if status_keluarga == "ya":
    tunjangan = 0.10 * gaji_pokok


gaji_bersih = gaji_pokok + bonus + tunjangan + uang_transport



print("+=============================+")
print(nama);
print(npm);
print(praktikum);
print("+=============================+")


print("\nRincian Gaji:")
print(f"Gaji Pokok      : Rp {gaji_pokok}")
print(f"Bonus           : Rp {bonus}")
print(f"Uang Transport  : Rp {uang_transport}")
print(f"Tunjangan       : Rp {tunjangan}")
print(f"Gaji Bersih     : Rp {gaji_bersih}")
