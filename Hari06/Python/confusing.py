def p(x):
    return x * 2 if x % 2 == 0 else x / 2

def q(x, y):
    return (x ** 2 + y ** 2) // p(y)

def r(a, b, c):
    return q(a, b) + q(b, c) if a != b else q(b, c) * p(c)

def confusing(x, y, z):
    for i in range(1, 10):
        x = p(x)
        y = q(y, z)
        z = r(x, y, z) + p(y)
    return x + y - z + r(x, y, z)


