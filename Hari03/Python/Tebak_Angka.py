import random

def tebak_angka():
    angka_rahasia = random.randint(1,100)
    tebakan = None
    percobaan = 0
    
    print("Tebak angka dari 1 sampai 100")
    while tebakan != angka_rahasia:
        tebakan = int(input("Masukkan tebakan kamu : "))
        percobaan += 1
        if tebakan < angka_rahasia:
            print("Tebakan terlalu rendah!")
        elif tebakan > angka_rahasia:
            print("Tebakan terlalu tinggi!")
        else:
            print(f"Selamat! Kamu berhasil menemukan angka rahasia dalam ")

tebak_angka()