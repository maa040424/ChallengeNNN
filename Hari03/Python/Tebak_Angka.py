import random

def tebak_angka():
    angka_rahasia = random.randint(1,100)
    tebakan = None
    percobaan = 0
    
    print("Tebak angka dari 1 sampai 100")
    while tebakan != angka_rahasia: