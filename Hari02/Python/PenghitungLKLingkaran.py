import math

#Rumus yang digunakan :
# Luas = π × r²
# Keliling = 2 × π × r

def hitung_lingkaran(radius):
    luas = math.pi * radius ** 2
    keliling = 2 * math.pi * radius
    return luas, keliling

radius = float(input("Masukan jari-jari lingkaran : "))
luas, keliling = hitung_lingkaran(radius)
print(f"Luas: {luas}")
print(f"Keliling : {keliling}")
