import random

def weird_func(a, b, c):
    x = (a * b) // (c + 1)  # Operasi yang tidak biasa
    y = random.choice([a, b, c]) * random.randint(1, 5)
    z = sum([i * i for i in range(1, x)]) // (x + y)  # Operasi bertingkat
    return (z + x - y) if z % 2 == 0 else (z - x + y)

def recursive_weird(x):
    if x <= 1:
        return x
    else:
        return recursive_weird(x - 1) * random.randint(1, 10) + recursive_weird(x // 2)

def final_step(x, y, z):
    result = weird_func(x, y, z)
    if result > 100:
        result = result // 2
    else:
        result = result * random.randint(1, 100)
    return result

