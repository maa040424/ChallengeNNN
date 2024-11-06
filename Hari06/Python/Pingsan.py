import random
import math

# Fungsi yang membuat rekursi tak terbatas dengan angka acak
def recursive_func(n, depth=0):
    if n <= 0 or depth > 100:
        return n
    else:
        return recursive_func(n - random.randint(1, 5), depth + 1) * random.choice([1, -1])

# Fungsi yang menggunakan faktor acak dalam perhitungan
def chaotic_multiply(a, b):
    if random.random() > 0.5:
        return a * b + random.randint(1, 100)
    else:
        return a * b - random.randint(1, 100)

# Fungsi dengan operasi kompleks dan rekursi dalam perhitungan
def complex_function(x, y, z):
    temp = chaotic_multiply(x, y)
    return recursive_func(temp + z) - chaotic_multiply(z, x) * random.randint(1, 5)

# Fungsi utama dengan perulangan dan operasi bertingkat
def dizzy_algorithm(a, b, c):
    seq = [a, b, c]
    for _ in range(50):  # 50 iterasi untuk membuat kebingungan
        new_seq = []
        for i in range(len(seq)):
            new_seq.append(complex_function(seq[i], seq[(i + 1) % len(seq)], seq[(i + 2) % len(seq)]))
        seq = [recursive_func(x) + random.choice([1, -1]) for x in new_seq]  # Rekursi dalam iterasi
        seq = [chaotic_multiply(x, random.randint(1, 10)) for x in seq]  # Gangguan acak
    return sum(seq) - max(seq)

# Program utama
result = dizzy_algorithm(10, 20, 30)
print(f"Final Result: {result}")
