def konversi_mata_uang(rupiah):
    nilai_tukar = {
        "USD":0.000066,  #dolar
        "EUR":0.000057,  #Euro
        "JPY":0.010      #Yen mun kd salah
    }
    hasil = {}
    for mata_uang, kurs in nilai_tukar.items():
        hasil[mata_uang] = rupiah * kurs
        return hasil
    
rupiah = float(input("Masukkan Jumlah Rupiah: "))
hasil_konversi = konversi_mata_uang(rupiah)

print("Hasil Konversi: ")
for mata_uang, jumlah in hasil_konversi.items():
    print(f"{mata_uang}: {jumlah:.2f}")
    print(f"{mata_uang}: {jumlah:.2f}")
    