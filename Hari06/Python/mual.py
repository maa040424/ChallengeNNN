import random

def weird_func(a, b, c):
    x = (a * b) // (c + 1)  # Operasi yang tidak biasa
    y = random.choice([a, b, c]) * random.randint(1, 5)
    z = sum([i * i for i in range(1, x)]) // (x + y)  # Operasi bertingkat
    return (z + x - y) if z % 2 == 0 else (z - x + y)


